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
	
	// TODO sort / compare to using dateCreated
	// public int compareTo() { }
}
