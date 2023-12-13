package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class StoreUserData {
	
	// how to make this scalable / easily configurable for future additions to data set? 
	
	ArrayList<User> users;
	HashMap<String, String> idToUserMapping;
	HashMap<String, String> professionToUserMapping;
	HashMap<String, String> countryToUserMapping;
	HashMap<String, String> dateToUserMapping;
	
	// fileName = "src/main/java/com/takehomeproject/MagMutual_AleksBelotserkovskaya/UserInformation.csv";
	
	public void storeUsers(String fileName) {
		users = new ArrayList<>();
		idToUserMapping = new HashMap<>();
		professionToUserMapping = new HashMap<>();
		countryToUserMapping = new HashMap<>();
		dateToUserMapping = new HashMap<>();
		
		users = ReadCSVFile.readFile(fileName);
		sortById();
		sortByProfession();
		sortByCountry();
		sortByDate();
	}
	
	public String getUsernameById(String id) {
		return idToUserMapping.get(id);
	}
	
	public String getUsersByProfession(String profession) {
		return professionToUserMapping.get(profession);
	}
	
	public String getUsersByCountry(String country) {
		return countryToUserMapping.get(country);
	}
	
	public String getUsersByDateRange(String date1, String date2) { // TODO flesh out
		// return dateToUserMapping.get(dateRange);
		// for every date between and including date 1 and date2, 
		// pull users from hashmap 
		String usersInDateRange = "";
		
//		for (String date : dateToUserMapping.keySet()) {
//			if (isDateBetweenRange(date, date1, date2)) {
//				usersInDateRange = usersInDateRange + dateToUserMapping.get(date);
//			}
//		}
		return usersInDateRange;
	}
	
	private boolean isDateBetweenRange(String date, String date1, String date2) {
		Date dateToCheck = Date.valueOf(date);
		Date startDate = Date.valueOf(date1);
		Date endDate = Date.valueOf(date2);
		return (dateToCheck.compareTo(startDate) >= 0) && (dateToCheck.compareTo(endDate) <= 0);
	}
	
	private void sortById() {
		for (User u : users) {
			if (idToUserMapping.get(u.getId()) == null) {
				idToUserMapping.put(u.getId(), u.getUserInfoById(u.getId()));
			}
		}
	}
	
	private void sortByProfession() { // do i want an array list of users or a string list?
		for (User u : users) {
			if (professionToUserMapping.get(u.getProfession()) == null) {
				professionToUserMapping.put(u.getProfession(), u.getUserName());
				// System.out.println("added " + u.getProfession());
				
			} else {
				professionToUserMapping.put(u.getProfession(), professionToUserMapping.get(u.getProfession()) + ", " + u.getUserName());
			}
		}
	}
	
	private void sortByCountry() { 
		for (User u : users) {
			if (countryToUserMapping.get(u.getCountry()) == null) {
				countryToUserMapping.put(u.getCountry(), u.getUserName());
				// System.out.println("added " + u.getCountry());
				// System.out.println("users: " + countryToUserMapping.get(u.getCountry()));
			} else {
				countryToUserMapping.put(u.getCountry(), countryToUserMapping.get(u.getCountry()) + ", " + u.getUserName());
			}
			//System.out.println("");
		}
		// System.out.println("users: " + countryToUserMapping.get("Gambia"));
	}
	
	private void sortByDate() {
		for (User u : users) {
			if (dateToUserMapping.get(u.getDate()) == null) {
				dateToUserMapping.put(u.getDate(), u.getUserName());
			} else {
				dateToUserMapping.put(u.getDate(), dateToUserMapping.get(u.getDate()) + ", " + u.getUserName());
			}
		}
	}
}
