package com.lease.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lease.manager.service.CountryStateCityService;

@Controller
public class CountryStateCityController {

	@Autowired
	@Qualifier("countryStateCityServiceImpl")
	private CountryStateCityService countryStateCityServiceImpl;
	
	@RequestMapping(value="/states",method=RequestMethod.POST)
	@ResponseBody
	public String getStatesOfCountry(@RequestParam("country") String country) {
		return countryStateCityServiceImpl.getStateList(country);
	}
}
