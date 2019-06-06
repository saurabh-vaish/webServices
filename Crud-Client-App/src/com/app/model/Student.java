package com.app.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	// should be same as in provider
	private int stuId;
	private String stuName;
	private String stuClass;
	private double stuMarks;
	private String stuSchool;
	
	public Student() {
		super();
	}
	
	
	public Student(int stuId, String stuName, String stuClass, double stuMarks, String stuSchool) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuMarks = stuMarks;
		this.stuSchool = stuSchool;
	}



	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public double getStuMarks() {
		return stuMarks;
	}
	public void setStuMarks(double stuMarks) {
		this.stuMarks = stuMarks;
	}
	public String getStuSchool() {
		return stuSchool;
	}
	public void setStuSchool(String stuSchool) {
		this.stuSchool = stuSchool;
	}
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuClass=" + stuClass + ", stuMarks=" + stuMarks
				+ ", stuSchool=" + stuSchool + "]";
	}
	
}
