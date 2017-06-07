package com.hpf.model;


import org.springframework.stereotype.Component;



@Component
public class RegionModel {
	
	private String regionjson;

	public String getRegionjson() {
		return regionjson;
	}

	public void setRegionjson(String regionjson) {
		this.regionjson = regionjson;
	}
}
