package com.lease.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "countryId")
	private int countryId;

	@Column(name = "countryCode")
	private String countryCode;

	@Column(name = "countryName")
	private String countryName;

	@Column(name = "countryPhoneCode")
	private long countryPhoneCode;

	public int getCountryId() {
		return countryId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public long getCountryPhoneCode() {
		return countryPhoneCode;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setCountryPhoneCode(long countryPhoneCode) {
		this.countryPhoneCode = countryPhoneCode;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ ", countryPhoneCode=" + countryPhoneCode + "]";
	}
 
}
