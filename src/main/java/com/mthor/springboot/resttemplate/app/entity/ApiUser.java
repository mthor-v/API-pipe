package com.mthor.springboot.resttemplate.app.entity;

public class ApiUser {

	private Long id;
	private String dni;
	private String name;
	private String last_name;
	private String email;
	private String password;
	private String birth;
	private Integer phone;
	private Integer other_contact;
	private String gender;
	private String role;
	private boolean active;
	private boolean payment_ok;

	public ApiUser() {
	}

	public ApiUser(Long id, String dni, String name, String last_name, String email, String password, String birth,
			Integer phone, Integer other_contact, String gender, String role, boolean active, boolean payment_ok) {
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.phone = phone;
		this.other_contact = other_contact;
		this.gender = gender;
		this.role = role;
		this.active = active;
		this.payment_ok = payment_ok;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getOther_contact() {
		return other_contact;
	}

	public void setOther_contact(Integer other_contact) {
		this.other_contact = other_contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isPayment_ok() {
		return payment_ok;
	}

	public void setPayment_ok(boolean payment_ok) {
		this.payment_ok = payment_ok;
	}

}
