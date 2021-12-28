package com;

public class Member {
	
	private String firstname, surname, cell,  email, password;

	public Member() {
		super();
	}

	public Member(String firstname, String surname, String email, String cell, String password) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.cell = cell;
		this.password = password;
	}
	public Member(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getFirstname() {return firstname;}

	public void setFirstname(String firstname) {this.firstname = firstname;}

	public String getSurname() {return surname;}

	public void setSurname(String surname) {this.surname = surname;}
	
	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public String getCell() {return cell;}

	public void setCell(String cell) {this.cell = cell;}

	public String getPassword() {return password;}

	public void setPassword(String password) {this.password = password;}
	

}
