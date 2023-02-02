//package com.sam.employeeapi.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import lombok.NoArgsConstructor;
//
//
//
//@NoArgsConstructor      //need default constructor for JSON Parsing
//
//@AllArgsConstructor
//@Data
//@Entity
//@ApiModel(description = "Creating model class for user logging in")
//@Table(name="users")	
//public class AuthenticationRequest {
//
//    
//	@Id
//    @Column(name="userName")
//    @ApiModelProperty(value = "Username of the user doing login")
//    private String username;
//    
//    @Column(name="password")
//    @ApiModelProperty(value = "Password of the user doing login")
//    private String password;
//
//
//}
//
