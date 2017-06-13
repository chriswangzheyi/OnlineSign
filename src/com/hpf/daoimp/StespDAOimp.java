package com.hpf.daoimp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hpf.dao.StespsDAO;
import com.hpf.model.UserModel;


@Repository("StepsDAO")
public class StespDAOimp implements StespsDAO {
	
	@Autowired
	DataSource datasource;

	@Override
	public List GetRestaurantType(UserModel loginmodel) {

		return null;
	}

}
