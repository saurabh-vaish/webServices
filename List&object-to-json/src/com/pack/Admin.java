package com.pack;

import java.util.List;

public class Admin {

	int adminId;
	List<Dept> obs;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public List<Dept> getObs() {
		return obs;
	}
	public void setObs(List<Dept> obs) {
		this.obs = obs;
	}
	
	
}
