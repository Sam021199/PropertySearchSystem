package com.sam.employeeapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sam.employeeapi.controller.UserController;

import static org.junit.Assert.*;


@SpringBootTest
class EmployeeApiApplicationTests {

	@Test
	void testingTest() {
		UserController user = new UserController();
		assertEquals("Testing Microservice!!!",user.test());
		
	}
}
