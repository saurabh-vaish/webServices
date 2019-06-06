package org.sathya.model;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;

@JsonbPropertyOrder({"employee-salary","employee-name"})    // to provide order
public class Employee {

	@JsonbTransient         // to prevent to go outside
	private int empId;
	@JsonbProperty("employee-name")     // provide alias name 
	private String empName;
	@JsonbProperty("employee-salary")  // provide alias  name
	private double empSal;
	
	
	public Employee() {
		super();
	}


	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
