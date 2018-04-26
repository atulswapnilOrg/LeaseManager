package com.lease.manager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lease.manager.model.Countries;

@Repository("countryStateCityDaoImpl")
public class CountryStateCityDaoImpl implements CountryStateCityDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Countries> getCountryList() {
		return sessionFactory.getCurrentSession().createQuery("from Countries").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getStateList(String country) {
		String sqlQueryStatement="select * from states where countryId=(select countryId from countries where countryName='"+country+"');";
		return sessionFactory.getCurrentSession().createSQLQuery(sqlQueryStatement).list();
	}

}
