package com.mysprhib.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.StudentMarkSecondary;

@Repository
public class StudentMarkSecondaryDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<StudentMarkSecondary> getStudentMarkSecondary(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentMarkSecondary> studentMarkSecondaryList = session.createQuery("from StudentMarkSecondary").list();
		return studentMarkSecondaryList;
	}	
	public StudentMarkSecondary getStudentMarkSecondarys(int studentId) {
		Session session =sessionFactory.openSession();
		StudentMarkSecondary sms = (StudentMarkSecondary) session.get(StudentMarkSecondary.class, studentId);
		return sms;
	}
}
