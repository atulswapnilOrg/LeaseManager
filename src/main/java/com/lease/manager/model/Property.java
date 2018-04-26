package com.lease.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class Property {
	
	//property_Id bigInt PRIMARY KEY AUTO_INCREMENT,
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="property_Id")
	private Long propertyId;
	
	//property_Name varchar(100) NOT NULL,
	@Column(name="property_Name")
	private String propertyName;
	
	//property_Type varchar(15) NOT NULL,
	@Column(name="property_Type")
	private String propertyType;
	
	//property_Sub_Type varchar(20) NOT NULL,
	@Column(name="property_Sub_Type")
	private String propertySubType;
	
	//number_of_Units varchar(3),
	@Column(name="number_of_Units")
	private String numberOfUnits;
	
	//rental_Owner varchar(30),
	@Column(name="rental_Owner")
	private String rentalOwner; 
	
	//operting_Account varchar(20),
	@Column(name="operating_Account")
	private String operatingAccount; 
	
	//property_Reserve varchar(20),
	@Column(name="property_Reserve")
	private String propertyReserve; 
	
	//street varchar(100) NOT NULL, 
	@Column(name="street")
	private String street;
	
	//city varchar(20) NOT NULL,
	@Column(name="city")
	private String city;
	
	//state varchar(20) NOT NULL,
	@Column(name="state")
	private String state;
	
	//zip varchar(10) NOT NULL,
	@Column(name="zip")
	private String zip;
	
	//country varchar(20) NOT NULL
	@Column(name="country")
	private String country;

	public Long getPropertyId() {
		return propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public String getPropertySubType() {
		return propertySubType;
	}

	public String getNumberOfUnits() {
		return numberOfUnits;
	}

	public String getRentalOwner() {
		return rentalOwner;
	}

	public String getOperatingAccount() {
		return operatingAccount;
	}

	public String getPropertyReserve() {
		return propertyReserve;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public void setPropertyId(Long property_Id) {
		this.propertyId = property_Id;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public void setPropertySubType(String propertySubType) {
		this.propertySubType = propertySubType;
	}

	public void setNumberOfUnits(String numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public void setRentalOwner(String rentalOwner) {
		this.rentalOwner = rentalOwner;
	}

	public void setOperatingAccount(String operatingAccount) {
		this.operatingAccount = operatingAccount;
	}

	public void setPropertyReserve(String propertyReserve) {
		this.propertyReserve = propertyReserve;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Property [property_Id=" + propertyId + ", propertyName=" + propertyName + ", propertyType="
				+ propertyType + ", propertySubType=" + propertySubType + ", numberOfUnits=" + numberOfUnits
				+ ", rentalOwner=" + rentalOwner + ", operatingAccount=" + operatingAccount + ", propertyReserve="
				+ propertyReserve + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + "]";
	}
	
	
	
}
