package com.model;
public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private String emailId;
    private String password;
	
	//constructor
	public Employee(String firstName, String LastName){
		this.firstName = firstName;
		this.lastName = LastName;
	}
	
	 public String getFirstName() {
	  return this.firstName;
	 }
	 
	 public String getLastName() {
	   return this.lastName;
	 }
	 
	 public String getEmailId() {
	   return this.emailId;
	 }
	 
	 public String getDepartment() {
	   return this.department;
	 }
	 
	 public String getPassword() {
	   return this.password;
	 }
	 
	 //Setters 
	 public void setDepartment(String department) {
		 this.department = department;
	 }
	 
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 
	 public void setEmailId(String emailId) {
		 this.emailId = emailId;
	 }
	 
}
