package com.mysprhib.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="STUDENT_MARK_SECONDARY")
public class StudentMarkSecondary {
	@Id
	@Column (name="student_id",length=5)
	private String studentId;
	@Column(name="english_mark")
	private int englishMark;
	@Column(name="hindi_mark")
	private int hindiMark;
	@Column(name="science_mark")
	private int scienceMark;
	@Column(name="social_mark")
	private int socialMark;
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
	public int getHindiMark() {
		return hindiMark;
	}
	public void setHindiMark(int hindiMark) {
		this.hindiMark = hindiMark;
	}
	public int getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}
	public int getSocialMark() {
		return socialMark;
	}
	public void setSocialMark(int socialMark) {
		this.socialMark = socialMark;
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
