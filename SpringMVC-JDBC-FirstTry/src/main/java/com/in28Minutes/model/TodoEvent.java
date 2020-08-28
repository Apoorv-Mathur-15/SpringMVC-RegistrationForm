package com.in28Minutes.model;

public class TodoEvent {
	
	private String name;
	private String enrollment;
	private String email;
	private String phone_number;
	private String whatsapp_number;
	private String college;
	private String event1;
	private String event2;
	private String event3;
	private String event4;
	
	public TodoEvent() {
		super();
	}

	public TodoEvent(String name, String enrollment, String email, String phone_number, String whatsapp_number,
			String college, String event1, String event2, String event3, String event4) {
		super();
		this.name = name;
		this.enrollment = enrollment;
		this.email = email;
		this.phone_number = phone_number;
		this.whatsapp_number = whatsapp_number;
		this.college = college;
		this.event1 = event1;
		this.event2 = event2;
		this.event3 = event3;
		this.event4 = event4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getWhatsapp_number() {
		return whatsapp_number;
	}

	public void setWhatsapp_number(String whatsapp_number) {
		this.whatsapp_number = whatsapp_number;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getEvent1() {
		return event1;
	}

	public void setEvent1(String event1) {
		this.event1 = event1;
	}

	public String getEvent2() {
		return event2;
	}

	public void setEvent2(String event2) {
		this.event2 = event2;
	}

	public String getEvent3() {
		return event3;
	}

	public void setEvent3(String event3) {
		this.event3 = event3;
	}

	public String getEvent4() {
		return event4;
	}

	public void setEvent4(String event4) {
		this.event4 = event4;
	}
	
}