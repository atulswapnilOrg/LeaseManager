package com.lease.manager.service;

import java.util.List;

import com.lease.manager.model.Property;

public interface PropertyService {
	public void addProperty(Property property);

	public List<Property> getAllPropertys();

	public void deleteProperty(Integer propertyId);

	public Property updateProperty(Property property);

	public Property getProperty(Long propertyId);
}
