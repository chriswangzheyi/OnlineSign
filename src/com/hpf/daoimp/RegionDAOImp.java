package com.hpf.daoimp;


import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hpf.controller.StepsController;
import com.hpf.dao.RegionDAO;
import com.hpf.model.RegionModel;
import com.hpf.util.WriteDocument;


import net.sf.json.JSONArray;


@Repository("RegionDAO")
public class RegionDAOImp implements RegionDAO {
	
	private static Log logger = LogFactory.getLog(RegionDAOImp.class.getName());

	@Autowired
	DataSource datasource;

	
	@Override
	public void getRegionInfo(RegionModel regionModel, String currentpath) {
		String sql ="select id, name, pid,regLevel from ec_sys_region";
    
	JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
	try {
		//读取地区信息并存入Json
		List<Map<String, Object>> regionList=jdbcTemplate.queryForList(sql);
        String regionJson =JSONArray.fromObject(regionList).toString();
        regionModel.setRegionjson(regionJson);;
        WriteDocument.writeByBufferedReader(currentpath+"\\"+"cityJson.json",regionModel.getRegionjson());
	} catch (Exception e) {
		e.printStackTrace();
		logger.error("从数据库获取地区失败，",e);
	}
	}




}
