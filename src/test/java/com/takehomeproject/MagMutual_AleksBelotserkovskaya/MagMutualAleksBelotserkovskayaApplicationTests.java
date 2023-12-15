package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class MagMutualAleksBelotserkovskayaApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testHomePage() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Welcome to Aleks's User Program!")));
	}
	
	@Test
	public void testSpecificUser() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/specificUser?id=100").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Info for User 100")));
	}
	
	@Test
	public void testSpecificProfession() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/usersByJob?job=worker").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Users who are workers:")));
	}
	
	@Test
	public void testSpecificDateRange() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/usersByDateRange?date1=2022-01-08&date2=2022-01-09").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Users created between 2022-01-08 and 2022-01-09:")));
	}
	
	@Test
	public void testSpecificCountry() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/usersByCountry?country=Gambia").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Users from Gambia:")));
	}
	
	@Test
	public void testCountryInput() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countryInput").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Please enter the Country you would like to list users for: ")));
	}
	
	@Test
	public void testJobInput() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/jobInput").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Please select the Profession you would like to list users for: ")));
	}
	
	@Test
	public void testUserIdInput() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/userId").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Please enter the User Id for the User you would like to look up:")));
	}
	
	@Test
	public void testDateRangeInput() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dateRangeInput").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Please enter the Date Range you would like to list users for (format yyyy-mm-dd):")));
	}

}