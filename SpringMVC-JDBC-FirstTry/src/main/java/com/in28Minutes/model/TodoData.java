package com.in28Minutes.model;

public class TodoData {
	
	private String name;
	private String enrollment;
	private String email;
	private String phone_number;
	private String whatsapp_number;
	private String college;
	
	public TodoData() {
		super();
	}

	public TodoData(String name, String enrollment, String email, String phone_number, String whatsapp_number, String college) {
		super();
		this.name = name;
		this.enrollment = enrollment;
		this.email = email;
		this.phone_number = phone_number;
		this.whatsapp_number = whatsapp_number;
		this.college = college;
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

	@Override
	public String toString() {
		return "Todo [name=" + name + ", enrollment=" + enrollment + ", email=" + email + "phone_number" + phone_number + 
				"whatsapp_number" + whatsapp_number + "college" + college + "]";
	}
}