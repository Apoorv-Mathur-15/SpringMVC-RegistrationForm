package com.in28Minutes.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.in28Minutes.hsql.HsqlDatabase;
import com.in28Minutes.model.TodoEvent;


public class TodoEventService {

	private static final String INSERT_TODO_QUERY = "INSERT INTO EventRegistration(NAME, ENROLLMENT, EMAIL, PHONE_NUMBER, "
			+ "WHATSAPP_NUMBER, COLLEGE, EVENT1, EVENT2, EVENT3, EVENT4) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	private static final String DELETE_TODO_QUERY = "DELETE FROM EventRegistration WHERE EMAIL=?";

	
	HsqlDatabase db = new HsqlDatabase();
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(db.conn, false));
	//public static Logger logger = LogManager.getLogger(TodoEventService.class);

	public void insertTodos(List<TodoEvent> TodoEvents) {
		for (TodoEvent TodoEvent : TodoEvents) {
			System.out.println("Accessing public Insert Todo");
			insertTodo(TodoEvent);
		}
	}

	private void insertTodo(TodoEvent todoevent) {
		System.out.println("Accessing private Insert Todo");
		jdbcTemplate.update(INSERT_TODO_QUERY, todoevent.getName(), todoevent.getEnrollment(), todoevent.getEmail(),
				todoevent.getPhone_number(), todoevent.getWhatsapp_number(), todoevent.getCollege(), 
				todoevent.getEvent1(), todoevent.getEvent2(), todoevent.getEvent3(), todoevent.getEvent4());
		System.out.println("Inserting into the Table Successfull");
	}

	public void deleteTodo(TodoEvent TodoEvent) {
		jdbcTemplate.update(DELETE_TODO_QUERY, TodoEvent.getName(), TodoEvent.getEmail());
	}
}