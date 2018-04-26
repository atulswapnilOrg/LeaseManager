package com.lease.manager.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lease.manager.dao.PropertyDao;
import com.lease.manager.model.Property;

@Service("propertyServiceImpl")
@Transactional
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	@Qualifier("propertyDaoImpl")
	private PropertyDao propertyDao;
	
	@Override
	@Transactional
	public void addProperty(Property property) {
		propertyDao.addProperty(property);
	}

	@Override
	@Transactional
	public List<Property> getAllPropertys() {
		return propertyDao.getAllPropertys();
	}

	@Override
	@Transactional
	public void deleteProperty(Integer propertyId) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public Property updateProperty(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Property getProperty(Long propertyId) {
		return propertyDao.getProperty(propertyId);
	}

}
