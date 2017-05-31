package com.hpf.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hpf.model.*;


public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserModel userModel = new UserModel();
/*		userModel.setPassword(rs.getString("name"));
		userModel.setUsername(rs.getString("username"));
		userModel.setPicsrc(rs.getString("picsrc"));*/
		
		return userModel;
	}
	
}
