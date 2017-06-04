package com.hpf.daoimp;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hpf.dao.RegionDAO;
import com.hpf.model.RegionModel;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Repository("RegionDAO")
public class RegionDAOImp implements RegionDAO {

	@Autowired
	DataSource datasource;
	
	
	@Override
	public List getRegionInfo(RegionModel regionModel) {
    String sql ="select id, name, pid, regLevel from ec_sys_region;";	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
	try {
		String result = (String)jdbcTemplate.queryForObject(sql, java.lang.String.class);
		System.out.println("½á¹û="+result);
		System.out.println("00000000000");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("11111111111");
	}

		
		return null;
	}

}
