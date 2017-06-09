package com.hpf.daoimp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hpf.dao.RegionDAO;
import com.hpf.model.RegionModel;
import com.hpf.util.WriteJson;
import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;

import net.sf.json.JSONArray;


@Repository("RegionDAO")
public class RegionDAOImp implements RegionDAO {

	@Autowired
	DataSource datasource;
	
	
	
	@Override
	public List getRegionInfo(RegionModel regionModel) {
		String sql ="select id, name, pid,regLevel from ec_sys_region";

    
	JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
	try {
		List<Map<String, Object>> regionList=jdbcTemplate.queryForList(sql);
        String regionJson =JSONArray.fromObject(regionList).toString();
        regionModel.setRegionjson(regionJson);
        System.out.println(regionModel.getRegionjson());
	} catch (Exception e) {
		System.out.println("读取地区数据库失败");
	}
	
		return null;
	}

}
