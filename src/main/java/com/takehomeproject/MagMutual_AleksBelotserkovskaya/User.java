package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import java.sql.Date;

public class User {
	
	// id,firstname,lastname,email,profession,dateCreated,country,city
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String profession;
	// date format 2020-08-31
	private String dateCreated;
	private String country;
	private String city;
	
	// getter methods
	
	public String getUserInfoById(String id) {
		return "Info for User " + id + " || First Name: " + firstName + " | Last Name: " + lastName + " | Email: " + email + " | Profession: " + profession + " | City: " + city + " | Country: " + country + " | Date User Was Created: " + dateCreated;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getProfession() {
		return this.profession;
	}
	
	public String getUserName() {
		return firstName + " " + lastName;
	}

	public String getCountry() {
		return country;
	}
	
	public String getDate() {
		return dateCreated;
	}
	
	// setter methods 
	
	public void setId(String newId) {
		id = newId;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public void setProfession(String newProfession) {
		profession = newProfession;
	}
	
	public void setDate(String newDate) {
		dateCreated = newDate;
	}
	
	public void setCountry(String newCountry) {
		country = newCountry;
	}
	
	public void setCity(String newCity) {
		city = newCity;
	}
	
	// TODO sort / compare to using dateCreated
	// public int compareTo() { }
}
