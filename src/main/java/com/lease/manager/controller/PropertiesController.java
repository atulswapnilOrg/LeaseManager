package com.lease.manager.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lease.manager.model.Property;
import com.lease.manager.model.validator.PropertyValidator;
import com.lease.manager.service.CountryStateCityService;
import com.lease.manager.service.PropertyService;

@Controller
public class PropertiesController {
	@Autowired
	@Qualifier("propertyServiceImpl")
	private PropertyService propertyServiceImpl;
	
	@Autowired
	@Qualifier("propertyValidator")
	private PropertyValidator propertyValidator;
	
	@Autowired
	@Qualifier("countryStateCityServiceImpl")
	private CountryStateCityService countryStateCityServiceImpl;
	
	@RequestMapping(value="/properties",method=RequestMethod.GET)
	public String viewAllProperties(ModelMap model) {
		List<Property> listOfProperty = propertyServiceImpl.getAllPropertys();
		model.addAttribute("listOfProperty", listOfProperty);
		return "propertiesList";
	}
	
	@RequestMapping(value="/getAddNewPropertyForm",method=RequestMethod.GET)
	public String getAddNewPropertyForm(ModelMap model) {
		model.addAttribute("property", new Property());
		model.addAttribute("countryList", countryStateCityServiceImpl.getCountryList());
		return "addPropertyForm";
	}
	
	@RequestMapping(value="/addNewProperty",method=RequestMethod.POST)
	public String addNewProperty(@ModelAttribute Property property, BindingResult bindingResult,ModelMap model) {
		propertyValidator.validate(property, bindingResult);
		if(bindingResult.hasErrors()) {
			model.addAttribute("property", property);
			model.addAttribute("countryList", countryStateCityServiceImpl.getCountryList());
			return "addPropertyForm";
		}
		propertyServiceImpl.addProperty(property);
		return "propertiesList";
	}
	
	@RequestMapping(value="/propertyDetails/{propertyId}",method=RequestMethod.GET)
	public String getProperty(@PathVariable("propertyId") Long propertyId,ModelMap model) {
		Property property = propertyServiceImpl.getProperty(propertyId);
		model.addAttribute("property",property);
		return "propertyDetails";
	}

}
