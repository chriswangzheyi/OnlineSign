package com.hpf.model;

import org.springframework.stereotype.Component;

@Component
public class PhoneValidationModel {
	
	private String bossPhone;
	private String managerPhone;
	
	//
	public String getBossPhone() {
		return bossPhone;
	}
	public void setBossPhone(String bossPhone) {
		this.bossPhone = bossPhone;
	}
	public String getManagerPhone() {
		return managerPhone;
	}
	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}
	
	
	

}
