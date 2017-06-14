package com.hpf.dao;

import java.util.List;

import com.hpf.model.PayNotifyModel;
import com.hpf.model.TypeModel;
import com.hpf.model.UserModel;

public interface StespsDAO {
	
	public List GetRestaurantType(TypeModel typeModel);
	
	public void CompleteApplication(UserModel userModel, PayNotifyModel payNotifyModel);

}
