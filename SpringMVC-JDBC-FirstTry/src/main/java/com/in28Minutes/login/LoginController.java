package com.in28Minutes.login;

import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28Minutes.jdbc.TodoDataService;
import com.in28Minutes.jdbc.TodoEventService;
import com.in28Minutes.model.TodoData;
import com.in28Minutes.model.TodoEvent;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		System.out.println("Login GET Request Accessed");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name, @RequestParam String email) throws SQLException, ClassNotFoundException {

		System.out.println("Login POST Request Accessed");
		System.out.println(name);
		System.out.println(email);
		if (!loginService.validateUser(name, email)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		TodoDataService dataService = new TodoDataService();
		String []result = dataService.retrieveTodo(email);
		model.put("name", result[0]);
		model.put("enrollment", result[1]);
		model.put("email", result[2]);
		model.put("phone_number", result[3]);
		model.put("whatsapp_number", result[4]);
		model.put("college", result[5]);
		return "welcome";
	}
	@RequestMapping(value = "/Edit", method = RequestMethod.GET)
	public String EditPage() {
		System.out.println("Edit Page Accessed");
		return "Edit";
	}
	
	@RequestMapping(value = "Edit", method = RequestMethod.POST)
	public String EditDetails(ModelMap model, @ModelAttribute TodoData tododata) {
		
		System.out.println("Accessing TodoDataService");
		TodoDataService dataService = new TodoDataService();
		
		System.out.println("Deleting Todo");
		dataService.deleteTodo(tododata);
		
		System.out.println("Deletion Successfull");
		
		System.out.println("Inserting Todo");
		dataService.insertTodos(Arrays.asList(tododata));
		
		System.out.println("Addition Successfull");
		
		return "welcome";
	}
	
	@RequestMapping(value = "/NewRegistration", method = RequestMethod.GET)
	public String RegistrationPage() {
		System.out.println("New Registration GET Request Accessed");
		return "NewRegistration";
	}
	
	@RequestMapping(value = "/NewRegistration", method = RequestMethod.POST)
	public String NewRegistration(ModelMap model, @ModelAttribute TodoData tododata ) throws SQLException {

		System.out.println("New Registration POST Request Accessed");
		System.out.println(tododata.getName());
		System.out.println(tododata.getEnrollment());
		System.out.println(tododata.getEmail());
		System.out.println(tododata.getPhone_number());
		System.out.println(tododata.getWhatsapp_number());
		System.out.println(tododata.getCollege());
		model.put("name", tododata.getName());
		model.put("enrollment", tododata.getEnrollment());
		model.put("email", tododata.getEmail());
		model.put("phone_number", tododata.getPhone_number());
		model.put("whatsapp_number", tododata.getWhatsapp_number());
		model.put("college", tododata.getCollege());
		
		System.out.println("Accessing TodoDataService");
		TodoDataService dataService = new TodoDataService();
		
		System.out.println("Inserting Todo");
		dataService.insertTodos(Arrays.asList(tododata));
		
		System.out.println("Addition Successfull");
		return "welcome";
	}
	
	@RequestMapping(value = "/EventRegister", method = RequestMethod.GET)
	public String EventPage() {
		System.out.println("Event Registration GET Request Accessed");
		return "EventRegister";
	}
	
	@RequestMapping(value = "/EventRegister", method = RequestMethod.POST)
	public String EventRegister(ModelMap model, @ModelAttribute TodoEvent todoevent) throws NullPointerException {
		System.out.println("Event Registration POST Request Accessed");

		System.out.println(todoevent.getName());
		System.out.println(todoevent.getEnrollment());
		System.out.println(todoevent.getEmail());
		System.out.println(todoevent.getPhone_number());
		System.out.println(todoevent.getWhatsapp_number());
		System.out.println(todoevent.getCollege());
		System.out.println(todoevent.getEvent1());
		System.out.println(todoevent.getEvent2());
		System.out.println(todoevent.getEvent3());
		System.out.println(todoevent.getEvent4());
		model.put("name", todoevent.getName());
		model.put("enrollment", todoevent.getEnrollment());
		model.put("email", todoevent.getEmail());
		model.put("phone_number", todoevent.getPhone_number());
		model.put("whatsapp_number", todoevent.getWhatsapp_number());
		model.put("college", todoevent.getCollege());
		model.put("event1", todoevent.getEvent1());
		model.put("event2", todoevent.getEvent2());
		model.put("event3", todoevent.getEvent3());
		model.put("event4", todoevent.getEvent4());
		
		TodoEventService dataService = new TodoEventService();
		
		dataService.insertTodos(Arrays.asList(todoevent));
		System.out.println("Addition Successfull");
		return "Register";
	}
}