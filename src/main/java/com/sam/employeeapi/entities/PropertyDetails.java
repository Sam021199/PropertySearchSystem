package com.sam.employeeapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="propertyDetails")
public class PropertyDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int propId;
	
	@Column(name="ownerFirstName")
	private String ownerFirstName;
	
	@Column(name="ownerLastName")
	private String ownerLastName;
	
	@Column(name="propAddress")
	private String propAddress;
	
	@Column(name="propType")
	private String propType;
	
	@Column(name="propLegalDesc")
	private String propLegalDesc;
	
	@Column(name="propTaxAmount")
	private long propTaxAmount;
	
	@Column(name="propTaxPaidStatus")
	private boolean propTaxPaidStatus;
	
}
