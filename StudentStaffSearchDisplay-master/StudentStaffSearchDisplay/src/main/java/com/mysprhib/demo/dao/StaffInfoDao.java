package com.mysprhib.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.StaffInfo;

@Repository
public class StaffInfoDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<StaffInfo> getStaffInfo(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StaffInfo> staffInfoList = session.createQuery("from StaffInfo").list();
		return staffInfoList;
	}	
	public StaffInfo getStaffInfos(int staffId) {
		Session session =sessionFactory.openSession();
		StaffInfo stf = (StaffInfo) session.get(StaffInfo.class, staffId);
		return stf;
	}
}
