package com.app.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement       // so that it can transfer to xml
public class Employee {

	private int empId;
	private String ename;
	private double sal;
	private double offer;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getOffer() {
		return offer;
	}
	public void setOffer(double offer) {
		this.offer = offer;
	}
	
	
	
	
}
