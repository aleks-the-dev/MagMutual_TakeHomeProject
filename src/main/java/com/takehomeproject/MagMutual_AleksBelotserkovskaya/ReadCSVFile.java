package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import java.util.ArrayList;
import java.io.*;  
import java.util.Scanner;  

public class ReadCSVFile {
	
	public static ArrayList<User> readFile(String file) { 
		
		try {
			
	        ArrayList<User> usersList = new ArrayList<>();

	        Scanner scanner = new Scanner(new File(file));

	        String line = scanner.nextLine();
	        
	        while (scanner.hasNextLine()) {
	            line = scanner.nextLine();

	            String[] parts = line.split(",");
	            
	            User u = new User();
	        	u.setId(parts[0]);
	        	u.setFirstName(parts[1]);
	        	u.setLastName(parts[2]);
	        	u.setEmail(parts[3]);
	        	u.setProfession(parts[4]);
	        	u.setDate(parts[5]);
	        	
	            if (parts.length > 8) {
	            	u.setCountry(parts[6] + "," + parts[7]);
	            	u.setCity(parts[8]);
	            } else {
	            	u.setCountry(parts[6]);
	            	u.setCity(parts[7]);
	            }
	            usersList.add(u);
	        }
	        
			scanner.close();
			return usersList;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ArrayList<User>();
		}

	}
}
