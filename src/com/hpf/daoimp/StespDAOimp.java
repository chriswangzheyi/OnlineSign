package com.hpf.daoimp;


import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hpf.dao.StespsDAO;
import com.hpf.model.PayNotifyModel;
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
			List<?> restaurantTypeList = jdbcTemplate.queryForList(sql); 
			      		   
			   return restaurantTypeList;
		} catch (Exception e) {
			System.out.println("ณ๖ดํมห");
		}

		return null;
	}

	@Override
	public void CompleteApplication(UserModel userModel, PayNotifyModel payNotifyModel) {
				
	
		String sql = "INSERT INTO ec_online_sign"
				+ "(lightPay, casherSystem, cooperateType,restaurantName , restaurantType"
				+ ",restaurantProvince,restaurantCity,restaurantDistrict,restaurantStreet"
				+ ",restaurantAddress,restaurantTel"
				+ ",restaurantOpenTime,restaurantCloseTime,restaurantIndroduction"
				+ ",managerPhone,bossPhone,restaurantViewsURL,baseURL,licenseURL"
				+ ",contractURL,attorneyURL,bankAccountName,bankAccountBank,bankAccountAccount"
				+ ",total_fee,pay_result,out_trade_no,time_end"
				+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
		
	jdbcTemplate.update( sql,userModel.getLightpay(),userModel.getCasherSystem(),
			userModel.getCooperatetype(),userModel.getRestaurantName(),userModel.getRestaurantType(),
			userModel.getRestaurantProvince(),userModel.getRestaurantCity(),
			userModel.getRestaurantDistrict(),userModel.getRestaurantStreet(),
			userModel.getRestaurantAddress(),userModel.getRestaurantTel(),
			userModel.getRestaurantOpentime(),userModel.getRestaurantClosetime(),
			userModel.getRestaurantIndroduction(),userModel.getManagerPhone(),
			userModel.getBossPhone(),userModel.getBaseurl(),userModel.getViewspath(),
			userModel.getLicensepath(),userModel.getContractpath(),userModel.getAttorneypath(),			
			userModel.getBankaccountName(),userModel.getBankaccountBank(),
			userModel.getBankaccountAccount(),payNotifyModel.getTotal_fee(),
			payNotifyModel.getPay_result(), payNotifyModel.getOut_trade_no(),
			payNotifyModel.getTime_end()
			);
	
		
	}

}
