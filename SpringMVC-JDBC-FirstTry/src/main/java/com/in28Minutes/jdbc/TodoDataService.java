package com.in28Minutes.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.in28Minutes.hsql.HsqlDatabase;
import com.in28Minutes.model.TodoData;


public class TodoDataService {

	private static final String INSERT_TODO_QUERY = "INSERT INTO Data(NAME, ENROLLMENT, EMAIL, PHONE_NUMBER, WHATSAPP_NUMBER, COLLEGE) "
			+ " VALUES(?, ?, ?, ?, ?, ?)";

	private static final String DELETE_TODO_QUERY = "DELETE FROM Data WHERE EMAIL=?";

	
	HsqlDatabase db = new HsqlDatabase();
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(db.conn, false));
	//public static Logger logger = LogManager.getLogger(TodoDataService.class);

	public void insertTodos(List<TodoData> todoDatas) {
		for (TodoData todoData : todoDatas) {
			System.out.println("Accessing public Insert Todo");
			insertTodo(todoData);
		}
	}

	private void insertTodo(TodoData todoData) {
		System.out.println("Accessing private Insert Todo");
		jdbcTemplate.update(INSERT_TODO_QUERY, todoData.getName(), todoData.getEnrollment(), todoData.getEmail(),
				todoData.getPhone_number(), todoData.getWhatsapp_number(), todoData.getCollege());
		System.out.println("Inserting into the Table Successfull");
	}

	public void deleteTodo(TodoData todoData) {
		jdbcTemplate.update(DELETE_TODO_QUERY, todoData.getEmail());
	}

	public String[] retrieveTodo(String email) throws SQLException {
		String query ="SELECT * FROM Data WHERE EMAIL = '" + email +"'";
		Statement st = db.conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		if(rs.next() == false) {
			st.close();
			return null;
		}
		else {
			String result[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
			st.close();
			return result;
		}
	}
	
	public static void main(String args[]) {
		
	}
}