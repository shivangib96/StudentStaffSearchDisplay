package com.mysprhib.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.StudentInfo;

@Repository
public class StudentInfoDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<StudentInfo> getStudentInfo(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentInfo> studentInfoList = session.createQuery("from StudentInfo").list();
		return studentInfoList;
	}	
	public StudentInfo getStudentInfos(int studentId) {
		Session session =sessionFactory.openSession();
		StudentInfo std = (StudentInfo) session.get(StudentInfo.class, studentId);
		return std;
	}

}
