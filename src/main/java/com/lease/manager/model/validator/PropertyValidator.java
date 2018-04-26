package com.lease.manager.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lease.manager.model.Property;

@Component("propertyValidator")
public class PropertyValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return Property.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		Property propertyObj = (Property) arg0;
		System.out.println("In validator..");
		//propertyName
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "propertyName", "property.propertyName");
		
		//propertyType
		if(null==propertyObj.getPropertyType()|| propertyObj.getPropertyType().isEmpty()||
		    "Select".equals(propertyObj.getPropertyType())
		    ||(!(("Residential".equals(propertyObj.getPropertyType()))||("Commercial".equals(propertyObj.getPropertyType()))))) {
			errors.rejectValue("propertyType", "property.propertyType");
		}
		
	}

}
