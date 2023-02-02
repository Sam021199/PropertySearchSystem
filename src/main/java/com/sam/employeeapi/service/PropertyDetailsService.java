package com.sam.employeeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.employeeapi.entities.PropertyDetails;
import com.sam.employeeapi.repository.PropertyDetailsRepo;

@Service
public class PropertyDetailsService {
	
	@Autowired
	private PropertyDetailsRepo propertyDetailsRepo;
	

	
	public PropertyDetails updateDetails(PropertyDetails propertyDetails) {
		Integer propNumber = propertyDetails.getPropId(); 
		PropertyDetails prop = propertyDetailsRepo.findById(propNumber).get();
		prop.setOwnerFirstName(propertyDetails.getOwnerFirstName());
		prop.setOwnerLastName(propertyDetails.getOwnerLastName());
		prop.setPropAddress(propertyDetails.getPropAddress());
		prop.setPropLegalDesc(propertyDetails.getPropLegalDesc());
		prop.setPropTaxAmount(propertyDetails.getPropTaxAmount());
		prop.setPropTaxPaidStatus(propertyDetails.isPropTaxPaidStatus());
		prop.setPropType(propertyDetails.getPropType());
		return propertyDetailsRepo.save(prop);		
	}
}
