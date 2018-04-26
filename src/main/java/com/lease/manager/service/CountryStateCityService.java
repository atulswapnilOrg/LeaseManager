package com.lease.manager.service;

import java.util.Map;

public interface CountryStateCityService {

	public Map<String,String> getCountryList();
	public String getStateList(String country);
}
