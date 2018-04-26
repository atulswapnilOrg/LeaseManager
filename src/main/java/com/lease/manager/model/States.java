package com.lease.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class States {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stateId")
	private int stateId;

	@Column(name = "stateName")
	private String stateName;

	@Column(name = "countryId")
	private int countryId;

	public int getStateId() {
		return stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "States [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + "]";
	}
 
}
