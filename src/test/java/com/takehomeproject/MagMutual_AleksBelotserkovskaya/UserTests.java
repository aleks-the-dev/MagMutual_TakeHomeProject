package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class UserTests {
	
	@Test
	public void testUserClass() {
		User u = new User();
		u.setFirstName("Aleks");
		u.setLastName("B");
		String userName = u.getUserName();
		String expectedUserName = "Aleks B";
		Assert.isTrue(userName.equals(expectedUserName), "Testing User Class.");
	}

}
