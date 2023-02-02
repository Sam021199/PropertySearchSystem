package com.sam.employeeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.employeeapi.entities.PropertyDetails;

@Repository
public interface PropertyDetailsRepo extends JpaRepository<PropertyDetails,Integer> {

}
