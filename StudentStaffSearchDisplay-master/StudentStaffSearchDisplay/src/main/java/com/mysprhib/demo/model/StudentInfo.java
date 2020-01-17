package com.mysprhib.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_INFO")
public class StudentInfo {
	@Id
	@Column(name="student_id",length=30)
	private String studentId;
	@Column(name="student_name",length=30)
	private String studentName;
	@Column(name="dates")
	private Date date;
	@Column(name="guardian_type")
	private char guardianType;
	@Column(name="guardian_name",length=30)
	private String guardianName;
	@Column(name="address",length=50)
	private String address;
	@Column(name="country_id",length=5)
	private String countryId;
	@Column(name="contact_no")
	private int contactNo;
	@Column(name="mail_id",length=30)
	private String mailId;
	@Column(name="gender")
	private char gender;
	@Column(name="standard")
	private String standard;
	@Column(name="standard_category",length=30)
	private char standardCategory;
	@Column(name="transport")
	private char transport;
	@Column(name="net_fees")
	private int netFees;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getGuardianType() {
		return guardianType;
	}
	public void setGuardianType(char guardianType) {
		this.guardianType = guardianType;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
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
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getStdandardCategory() {
		return standardCategory;
	}
	public void setStdandardCategory(char stdandardCategory) {
		this.standardCategory = stdandardCategory;
	}
	public char getTransport() {
		return transport;
	}
	public void setTransport(char transport) {
		this.transport = transport;
	}
	public int getNetFees() {
		return netFees;
	}
	public void setNetFees(int netFees) {
		this.netFees = netFees;
	}
}
