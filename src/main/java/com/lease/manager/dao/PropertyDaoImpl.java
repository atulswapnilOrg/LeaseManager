package com.lease.manager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lease.manager.model.Property;

@Repository("propertyDaoImpl")
public class PropertyDaoImpl implements PropertyDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addProperty(Property property) {
		sessionFactory.getCurrentSession().saveOrUpdate(property);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getAllPropertys() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Property").list();
	}

	@Override
	public void deleteProperty(Integer propertyId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Property updateProperty(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getProperty(Long propertyId) {
		return (Property) sessionFactory.getCurrentSession().get(Property.class, propertyId);
	}

}
