package com.lease.manager.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lease.manager.dao.CountryStateCityDao;
import com.lease.manager.model.Countries;

@Service("countryStateCityServiceImpl")
@Transactional
public class CountryStateCityServiceImpl implements CountryStateCityService {

	@Autowired
	@Qualifier("countryStateCityDaoImpl")
	private CountryStateCityDao countryStateCityDaoImpl;
	
	@Override
	@Transactional
	public Map<String,String> getCountryList() {
		Map<String,String> countryListMap= new HashMap<String,String>();
		List<Countries> countriesData= countryStateCityDaoImpl.getCountryList();
		for (Countries country : countriesData) {
			countryListMap.put(country.getCountryName(),country.getCountryName());
		}
		return countryListMap;
	}

	@Override
	@Transactional
	public String getStateList(String country) {
		StringBuilder stateList = new StringBuilder();
		 List<Object[]> rows= countryStateCityDaoImpl.getStateList(country);

		 for(Object[] row : rows){
			System.out.println(row[1].toString());
			stateList.append(row[1].toString()).append("|");
		}
		return stateList.toString();
	}

}
