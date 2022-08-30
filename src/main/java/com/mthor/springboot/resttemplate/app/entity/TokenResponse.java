package com.mthor.springboot.resttemplate.app.entity;

public class TokenResponse {

	private String refresh;
	private String access;
	private String name;
	private String role;
	private boolean status;
	private boolean pay;

	public TokenResponse(String refresh, String access, String name, String role, boolean status, boolean pay) {
		this.refresh = refresh;
		this.access = access;
		this.name = name;
		this.role = role;
		this.status = status;
		this.pay = pay;
	}

	public TokenResponse() {
	}

	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

}
