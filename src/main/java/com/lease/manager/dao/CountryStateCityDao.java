package com.lease.manager.dao;

import java.util.List;

import com.lease.manager.model.Countries;

public interface CountryStateCityDao {
	public List<Countries> getCountryList();
	public List<Object[]> getStateList(String country);
}
