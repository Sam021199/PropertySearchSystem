package com.sam.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sam.employeeapi.entities.PropertyDetails;
import com.sam.employeeapi.repository.PropertyDetailsRepo;
import com.sam.employeeapi.service.PropertyDetailsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PropertyDetailsController {
	
	
	
	@Autowired
	PropertyDetailsRepo pdr;
	
	@Autowired
	PropertyDetailsService propDetailService;

	
	 @GetMapping("/getDetails")
	    public List<PropertyDetails> getDetails() {
	    	return pdr.findAll();
	    }
	 
	 @GetMapping("/getDetailsById/{propId}")
	    public PropertyDetails getDetailsById(@PathVariable("propId") int propId) {
	    	return pdr.findById(propId).get();
	    }
	
	 @RequestMapping(value = "/details", method = {RequestMethod.POST})
		public PropertyDetails savePropertyDetails(@RequestBody PropertyDetails pd) {
			return pdr.save(pd);    	
		}
	 
	 @RequestMapping(value = "/updateDetails", method = {RequestMethod.PUT})
	    public PropertyDetails updateDetails(@RequestBody PropertyDetails pdd) {
//		 if(us.isAdminUser()) {
		 	return propDetailService.updateDetails(pdd);
//		 }else {
//			 return null;
//		 }
	 }
	 
	 @DeleteMapping("/deleteDetailsById/{propId}")
	    public String deleteDetailsById(@PathVariable("propId") int propId) {
	    	pdr.deleteById(propId);
	    	return "Record Deleted";
	    }
	 
	 @PutMapping("/updateById/{propId}")
	    public ResponseEntity<PropertyDetails> updateById(@PathVariable("propId") int propId,@RequestBody PropertyDetails upd) {
	    	PropertyDetails getDetails = pdr.getById(propId);
	    	getDetails.setOwnerFirstName(upd.getOwnerFirstName());
	    	getDetails.setOwnerLastName(upd.getOwnerLastName());
	    	getDetails.setPropAddress(upd.getPropAddress());
	    	getDetails.setPropLegalDesc(upd.getPropLegalDesc());
	    	getDetails.setPropTaxAmount(upd.getPropTaxAmount());
	    	getDetails.setPropTaxPaidStatus(upd.isPropTaxPaidStatus());
	    	getDetails.setPropType(upd.getPropType());
	    	
	    	PropertyDetails updatedDetails = pdr.save(getDetails);
	    	
	    	return ResponseEntity.ok().body(updatedDetails);
	    }


}
