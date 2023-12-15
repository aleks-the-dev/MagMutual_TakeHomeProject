package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class ReadCSVFileTests {
	
	@Test
	public void testReadFile() {
		String fileName = "";
		ArrayList<User> users = ReadCSVFile.readFile(fileName);
		ArrayList<User> expectedUsers = new ArrayList<>();
		Assert.isTrue(users == expectedUsers, "User ArrayList should contain info from CSV file.");
	}

}