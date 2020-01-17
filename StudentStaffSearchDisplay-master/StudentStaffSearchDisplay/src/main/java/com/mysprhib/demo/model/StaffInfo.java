package com.mysprhib.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_INFO")
public class StaffInfo {
	@Id
	@Column(name="staff_id",length=5)
	private String staffId;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(name="staff_name",length=25)
	private String staffName;
	@Column(name="address",length=50)
	private String address;
	@Column(name="country_id",length=25)
	private String countryId;
	@Column(name="gender",length=1)
	private char gender;
	@Column(name="salary")
	private int salary;
	@Column(name="highest_qualification",length=25)
	private String highestQualification;
	@Column(name="email_id",length=25)
	private String emailId;
	@Column(name="contact_number")
	private int contactNumber;
	@Column(name="designation",length=25)
	private String designation;
	@Column(name="year_passed_out")
	private int yearPassedOut;
	@Column(name="experience")
	private int experience;
	@Column(name="doj")
	private Date doj;
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYearPassedOut() {
		return yearPassedOut;
	}
	public void setYearPassedOut(int yearPassedOut) {
		this.yearPassedOut = yearPassedOut;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
	
}
