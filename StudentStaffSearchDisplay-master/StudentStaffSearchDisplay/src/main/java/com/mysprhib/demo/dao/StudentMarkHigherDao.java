package com.mysprhib.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.StudentMarkHigher;

@Repository
public class StudentMarkHigherDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<StudentMarkHigher> getStudentMarkHigher(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentMarkHigher> studentMarkHigherList = session.createQuery("from StudentMarkHigher").list();
		return studentMarkHigherList;
	}	
	public StudentMarkHigher getStudentMarkHighers(int studentId) {
		Session session =sessionFactory.openSession();
		StudentMarkHigher smh = (StudentMarkHigher) session.get(StudentMarkHigher.class, studentId);
		return smh;
	}
}
