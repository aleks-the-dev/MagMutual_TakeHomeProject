package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import java.util.ArrayList;

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
			info = "No users found. Confirm that your input was correct or try a different id.";
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
		s.storeUsers(fileName);
		ArrayList<String> countries = s.getCountries();
		model.addAttribute("countries", countries);
		return "entercountry";
	}
				
	// Endpoint to go to page where you enter profession
	@GetMapping("/jobInput") 
		public String jobInput(Model model) {
		s.storeUsers(fileName);
		ArrayList<String> jobs = s.getJobs();
		model.addAttribute("jobs", jobs);
		return "enterjob";
	}
				
	// Endpoint to go to page where you enter date range
	@GetMapping("/dateRangeInput") 
		public String dateRangeInput(Model model) {
		return "enterdaterange";
	}

}