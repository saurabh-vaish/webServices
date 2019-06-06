package com.pack;

import java.util.Map;

public class Admin {

	int adminId;
	Map<String,Dept> obs;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public Map<String, Dept> getObs() {
		return obs;
	}
	public void setObs(Map<String, Dept> obs) {
		this.obs = obs;
	}
	
	
}
