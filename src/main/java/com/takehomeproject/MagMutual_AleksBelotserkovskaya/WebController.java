package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	StoreUserData s = new StoreUserData();
	String fileName = "src/main/java/com/takehomeproject/MagMutual_AleksBelotserkovskaya/UserInformation.csv";
	
	// Endpoint to return a specific user (and all associated information)
	@GetMapping("/specificUser")
	public String specificUser(@RequestParam(value="id", required=false, defaultValue="World") String id, Model model) {
		model.addAttribute("id", id);
		s.storeUsers(fileName);
		String info = s.getUsernameById(id);
		if (info == null) {
			info = "No users found. Try a different id.";
		}
		model.addAttribute("info", info);
		return "specificuser";
	}
	
	// Endpoint to return a list of users created between a date range
	@GetMapping("/usersByDateRange") 
	public String usersByDateRange(@RequestParam(value="date1", required=false, defaultValue="World") String date1, 
			@RequestParam(value="date2", required=false, defaultValue="World") String date2, Model model) {
		model.addAttribute("date1", date1);
		model.addAttribute("date2", date2);
		s.storeUsers(fileName);
		String usersByDateRange = s.getUsersByDateRange(date1, date2);
		System.out.println(usersByDateRange);
		model.addAttribute("usersByDateRange", usersByDateRange);
		return "usersbydaterange";
	}
	
	// Endpoint to return a list of users based on a specific profession
	@GetMapping("/usersByJob") 
	public String usersByProfession(@RequestParam(value="job", required=false, defaultValue="World") String job, Model model) {
		model.addAttribute("job", job);
		s.storeUsers(fileName);
		String usersByJob = s.getUsersByProfession(job);
		System.out.println(usersByJob);
		model.addAttribute("usersByJob", usersByJob);
		return "usersbyjob";
	}
	
	// Custom Endpoint that I designed on my own (get list of users by country).
	@GetMapping("/usersByCountry") 
	public String customEndpoint(@RequestParam(name="country", required=false, defaultValue="World") String country, Model model) {
		model.addAttribute("country", country);
		s.storeUsers(fileName);
		String usersByCountry = s.getUsersByCountry(country);
		System.out.println(usersByCountry);
		model.addAttribute("usersByCountry", usersByCountry);
		return "usersbycountry";
	}
	
	// Endpoint to go to page where you enter user id
	@GetMapping("/userId") 
	public String userId(Model model) {
		return "enteruserid";
	}
		
	// Endpoint to go to page where you enter country
	@GetMapping("/countryInput") 
		public String countryInput(Model model) {
		return "entercountry";
	}
				
	// Endpoint to go to page where you enter profession
	@GetMapping("/jobInput") 
		public String jobInput(Model model) {
		return "enterjob";
	}
				
	// Endpoint to go to page where you enter date range
	@GetMapping("/dateRangeInput") 
		public String dateRangeInput(Model model) {
		return "enterdaterange";
	}
	
	// ideas for verification and error messages: 
	// incorrect city/country combo
	// how to allow for user to input csv file + check for incorrect columns or data or format
	// no user found, wrong spelling of name, etc. 
	
	// ideas for improving ui: 
	// add buttons to screen for ease of usability 
	// add text boxes to select user id
	// or could choose dropdown of user id's
	
	// could do dropdown of countries
	// date range - how to enter? 
	// could also do dropdown of professions
	
	// maybe when a list appears, a user could click button next to each listed user to see their full info 
	// (might be too complex to do by project deadline)
	
	// overall TO DO's: 
	// 
	// 1) add tests 
	//  
	// 2) change drop downs to not be static and instead pull info from csv file OR hashmaps
	// ( for countries + professions) 
	// 
	// 3) answer project questions
	// 
	// 4) if i have time, make it look prettier (mostly user info page) 

}