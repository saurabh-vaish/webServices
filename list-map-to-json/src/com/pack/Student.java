package com.pack;

import java.util.List;
import java.util.Map;

public class Student {
 
	int sid;
	List<Subject> sbs;
	Map<String,Double> result;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public List<Subject> getSbs() {
		return sbs;
	}
	public void setSbs(List<Subject> sbs) {
		this.sbs = sbs;
	}
	public Map<String, Double> getResult() {
		return result;
	}
	public void setResult(Map<String, Double> result) {
		this.result = result;
	}
	
	
}
