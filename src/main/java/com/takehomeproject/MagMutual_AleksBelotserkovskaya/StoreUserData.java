package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import java.util.ArrayList;
import java.util.HashMap;

public class StoreUserData {
	
	// how to make this scalable / easily configurable for future additions to data set? 
	
	ArrayList<User> users = new ArrayList<>();
	HashMap<String, String> idToUserMapping = new HashMap<>();
	HashMap<String, String> professionToUserMapping = new HashMap<>();
	HashMap<String, String> countryToUserMapping = new HashMap<>();
	HashMap<String, String> dateToUserMapping = new HashMap<>();
	
	public void storeUsers(String fileName) {
		users = ReadCSVFile.readFile(fileName);
		sortById();
		sortByProfession();
		sortByCountry();
		sortByDate();
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
			if (idToUserMapping.get(u.getProfession()) == null) {
				idToUserMapping.put(u.getProfession(), u.getUserName());
			} else {
				idToUserMapping.put(u.getProfession(), idToUserMapping.get(u.getProfession()) + ", " + u.getUserName());
			}
		}
	}
	
	private void sortByCountry() {
		for (User u : users) {
			if (idToUserMapping.get(u.getCountry()) == null) {
				idToUserMapping.put(u.getCountry(), u.getUserName());
			} else {
				idToUserMapping.put(u.getCountry(), idToUserMapping.get(u.getCountry()) + ", " + u.getUserName());
			}
		}
	}
	
	private void sortByDate() {
		for (User u : users) {
			if (idToUserMapping.get(u.getDate()) == null) {
				idToUserMapping.put(u.getDate(), u.getUserName());
			} else {
				idToUserMapping.put(u.getDate(), idToUserMapping.get(u.getDate()) + ", " + u.getUserName());
			}
		}
	}
}
