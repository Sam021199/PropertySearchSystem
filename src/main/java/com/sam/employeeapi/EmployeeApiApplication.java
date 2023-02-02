package com.sam.employeeapi;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.sam.employeeapi.entities.AuthenticationRequest;
//import com.sam.employeeapi.repository.AuthenticationRequestRepo;


@SpringBootApplication
public class EmployeeApiApplication {
	
//	@Autowired
//	private AuthenticationRequestRepo authRequestRepo;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}
	
//	public void run(String... args) throws Exception{
//		AuthenticationRequest user1 = new AuthenticationRequest("Sam","sam03");
//		AuthenticationRequest user2 = new AuthenticationRequest("Sahaj","sahaj03");
//
//
//		authRequestRepo.save(user1);
//		authRequestRepo.save(user2);
//	}

}
