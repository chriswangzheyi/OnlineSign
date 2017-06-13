package com.hpf.daoimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hpf.dao.StespsDAO;
import com.hpf.model.TypeModel;
import com.hpf.model.UserModel;


@Repository("StepsDAO")
public class StespDAOimp implements StespsDAO {
	
	@Autowired
	DataSource datasource;

	@Override
	public List<?> GetRestaurantType(TypeModel typeModel) {
		
		
		String sql ="select name from ec_bus_shop_type";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
		
		try {
			//List<Map<String,Object>> restaurantTypeList=jdbcTemplate.queryForList(sql);
			List restaurantTypeList = jdbcTemplate.queryForList(sql); 
			      		   
			   return restaurantTypeList;
		} catch (Exception e) {
			System.out.println("ณ๖ดํมห");
		}

		return null;
	}

}
