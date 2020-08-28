package com.in28Minutes.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.in28Minutes.hsql.HsqlDatabase;

@Service
public class LoginService {
	public boolean validateUser(String name, String email) throws SQLException, ClassNotFoundException {
		HsqlDatabase db = new HsqlDatabase();
		Statement st = db.conn.createStatement();
		String query = "SELECT * FROM Data WHERE NAME = '" + name +"' ";
		System.out.println("Executing the Query now");
		ResultSet rs = st.executeQuery(query);
		System.out.println("Query Executed");
		if(rs.next() == false) {
			return false;
		}
		else {
			if(rs.getString(3).equalsIgnoreCase(email)) {
				return true;
			}
			else {
				return false;
			}
		}
	}

}