package com.sam.employeeapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sam.employeeapi.entities.Users;
import com.sam.employeeapi.repository.UserRepo;



//@RequestMapping(value="/api/vi/")
@RestController
public class UserController {

	@Autowired
	UserRepo userRepo;
	
//	@PostMapping(value="saveUsers")
    @RequestMapping(value = "/users", method = {RequestMethod.POST})
	public Users saveUser(@RequestBody Users user) {
		return userRepo.save(user);    	
	}
    
    @GetMapping("/getUsers")
    public List<Users> getUser() {
    	return userRepo.findAll();
    }
    
    @GetMapping("/getUserByIds/{userId}")
    public Users getUserById(@PathVariable("userId") int userId){
		return userRepo.findById(userId).get();	
    }
    
    @DeleteMapping("/deleteUserByIds/{userId}")
    public String deleteUserById(@PathVariable("userId") int userId) {
    	userRepo.deleteById(userId);
    	return "Record Deleted";
    }
    
    @RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		return "Testing Microservice!!!";
	}
    
    
//    @RequestMapping(value = "/userIds{userId}", method = {RequestMethod.GET})
//    public int getUserId(@RequestBody){
//    	return userRepo.
//    }
    
    
}

