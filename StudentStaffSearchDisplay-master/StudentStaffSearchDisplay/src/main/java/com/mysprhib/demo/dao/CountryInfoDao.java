package com.mysprhib.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.CountryInfo;

@Repository
public class CountryInfoDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<CountryInfo> getCountryInfo(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<CountryInfo> countryInfoList = session.createQuery("from CountryInfo").list();
		return countryInfoList;
	}	
	public CountryInfo getCountryInfos(int countryId) {
		Session session =sessionFactory.openSession();
		CountryInfo cif = (CountryInfo) session.get(CountryInfo.class, countryId);
		return cif;
	}

}
