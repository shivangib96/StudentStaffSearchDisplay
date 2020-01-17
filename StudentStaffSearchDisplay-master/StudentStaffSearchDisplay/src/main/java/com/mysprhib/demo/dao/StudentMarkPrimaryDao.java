package com.mysprhib.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.StudentMarkPrimary;

@Repository
public class StudentMarkPrimaryDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<StudentMarkPrimary> getStudentMarkPrimary(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentMarkPrimary> studentMarkPrimaryList = session.createQuery("from StudentMarkPrimary").list();
		return studentMarkPrimaryList;
	}	
	public StudentMarkPrimary getStudentMarkPrimarys(int studentId) {
		Session session =sessionFactory.openSession();
		StudentMarkPrimary smp = (StudentMarkPrimary) session.get(StudentMarkPrimary.class, studentId);
		return smp;
	}
}
