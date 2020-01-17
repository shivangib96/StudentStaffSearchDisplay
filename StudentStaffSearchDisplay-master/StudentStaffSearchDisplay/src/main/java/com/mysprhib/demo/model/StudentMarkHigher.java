package com.mysprhib.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="STUDENT_MARK_HIGHER")
public class StudentMarkHigher {
	@Id
	@Column (name="student_id",length=5)
	private String studentId;
	@Column(name="english_mark")
	private int englishMark;
	@Column(name="tamil_mark")
	private int tamilMark;
	@Column(name="physics_mark")
	private int physicsMark;
	@Column(name="chemistry_mark")
	private int chemistryMark;
	@Column(name="computer_mark")
	private int computerMark;
	@Column(name="maths_mark")
	private int mathsMark;
	@Column(name="total_mark")
	private int totalMark;
	@Column(name="average_mark")
	private int averageMark;
	@Column(name="grade",length=3)
	private char grade;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getEnglishMark() {
		return englishMark;
	}
	public void setEnglishMark(int englishMark) {
		this.englishMark = englishMark;
	}
	public int getTamilMark() {
		return tamilMark;
	}
	public void setTamilMark(int tamilMark) {
		this.tamilMark = tamilMark;
	}
	public int getPhysicsMark() {
		return physicsMark;
	}
	public void setPhysicsMark(int physicsMark) {
		this.physicsMark = physicsMark;
	}
	public int getChemistryMark() {
		return chemistryMark;
	}
	public void setChemistryMark(int chemistryMark) {
		this.chemistryMark = chemistryMark;
	}
	public int getComputerMark() {
		return computerMark;
	}
	public void setComputerMark(int computerMark) {
		this.computerMark = computerMark;
	}
	public int getMathsMark() {
		return mathsMark;
	}
	public void setMathsMark(int mathsMark) {
		this.mathsMark = mathsMark;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	public int getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(int averageMark) {
		this.averageMark = averageMark;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}
