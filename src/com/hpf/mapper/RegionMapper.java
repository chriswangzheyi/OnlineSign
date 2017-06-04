package com.hpf.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hpf.model.*;

import javafx.scene.layout.Region;


public class RegionMapper implements RowMapper<RegionModel> {

	@Override
	public RegionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		RegionModel regionModel = new RegionModel();

		
		return regionModel;
	}
	
}
