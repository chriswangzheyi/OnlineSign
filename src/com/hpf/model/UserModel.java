package com.hpf.model;


import org.springframework.stereotype.Component;

@Component
public class UserModel {
	
	//²ÎÊı
	private String restaurantProvince;
	private String restaurantCity;
	private String restaurantDistrict;
	private String restaurantStreet;
	private String restaurantType;
	private String restaurantAddress;
	private String restaurantTel;
	private String restaurantOpentime;
	private String restaurantClosetime;
	
	//getter and setter
	public String getRestaurantProvince() {
		return restaurantProvince;
	}
	public void setRestaurantProvince(String restaurantProvince) {
		this.restaurantProvince = restaurantProvince;
	}
	public String getRestaurantCity() {
		return restaurantCity;
	}
	public void setRestaurantCity(String restaurantCity) {
		this.restaurantCity = restaurantCity;
	}
	public String getRestaurantDistrict() {
		return restaurantDistrict;
	}
	public void setRestaurantDistrict(String restaurantDistrict) {
		this.restaurantDistrict = restaurantDistrict;
	}
	public String getRestaurantStreet() {
		return restaurantStreet;
	}
	public void setRestaurantStreet(String restaurantStreet) {
		this.restaurantStreet = restaurantStreet;
	}
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantTel() {
		return restaurantTel;
	}
	public void setRestaurantTel(String restaurantTel) {
		this.restaurantTel = restaurantTel;
	}
	public String getRestaurantOpentime() {
		return restaurantOpentime;
	}
	public void setRestaurantOpentime(String restaurantOpentime) {
		this.restaurantOpentime = restaurantOpentime;
	}
	public String getRestaurantClosetime() {
		return restaurantClosetime;
	}
	public void setRestaurantClosetime(String restaurantClosetime) {
		this.restaurantClosetime = restaurantClosetime;
	}
	



}
