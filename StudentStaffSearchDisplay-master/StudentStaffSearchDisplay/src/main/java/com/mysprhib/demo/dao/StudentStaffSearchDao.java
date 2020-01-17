package com.mysprhib.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysprhib.demo.model.CountryInfo;
import com.mysprhib.demo.model.StaffInfo;
import com.mysprhib.demo.model.StudentInfo;
import com.mysprhib.demo.model.StudentMarkHigher;
import com.mysprhib.demo.model.StudentMarkPrimary;
import com.mysprhib.demo.model.StudentMarkSecondary;

@Repository
public class StudentStaffSearchDao {
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List<com.mysprhib.demo.model.CountryInfo> getCountryInfo(){
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
	public List<StaffInfo> getStaffInfo(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StaffInfo> staffInfoList = session.createQuery("from StaffInfo").list();
		return staffInfoList;
	}	
	public StaffInfo getStaffInfos(String staffId) {
		Session session =sessionFactory.openSession();
		StaffInfo stf = (StaffInfo) session.get(StaffInfo.class, staffId);
		return stf;
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
	
	public ArrayList<Object> getStudentMarks(String standard) {
		Session session =sessionFactory.openSession();
		
		if(standard.equalsIgnoreCase("primary"))
		{
			
		ArrayList<Object> studMarks=(ArrayList<Object>)session.createQuery("from StudentMarkPrimary").list();
			return studMarks;
		}
		
		if(standard.equalsIgnoreCase("secondary"))
		{

			ArrayList<Object> studMarks=(ArrayList<Object>)session.createQuery("from StudentMarkSecondary").list();
			return studMarks;
		}
		
		if(standard.equalsIgnoreCase("higher"))
		{
			ArrayList<Object> studMarks=(ArrayList<Object>)session.createQuery("from StudentMarkHigher").list();
			return studMarks;
		}
		
		return null;
	}
	
	
	
	
	public ArrayList<StaffInfo> getStaffInfo(String desig,int salary,int exp,String qul) {
		Session session =sessionFactory.openSession();
		Query  query=session.createQuery("from StaffInfo s where s.salary=:sal and s.designation=:desig and s.highestQualification=:qual and s.experience=:exp ");
		query.setParameter("sal",salary);
		query.setParameter("desig",desig);
		query.setParameter("qual",qul);
		query.setParameter("exp",exp);
		
	 ArrayList<StaffInfo> staffList=( ArrayList<StaffInfo> )query.list();
		
		
		return staffList;
		
		
	}
	
	
	
	
}
