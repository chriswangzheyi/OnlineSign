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
			List restaurantTypeList = jdbcTemplate.queryForList(sql); 
			      		   
			   return restaurantTypeList;
		} catch (Exception e) {
			System.out.println("³ö´íÁË");
		}

		return null;
	}

	@Override
	public void CompleteApplication(UserModel userModel, PayNotifyModel payNotifyModel) {
		
/*		System.out.println("userModel.getLightpay()="+userModel.getLightpay());
		System.out.println("userModel.getCasherSystem()="+userModel.getCasherSystem());
		System.out.println("userModel.getCooperatetype()="+userModel.getCooperatetype());
		System.out.println("userModel.getRestaurantName()="+userModel.getRestaurantName());
		System.out.println("userModel.getRestaurantType()="+userModel.getRestaurantType());
		System.out.println("userModel.getRestaurantProvince()="+userModel.getRestaurantProvince());
		System.out.println("userModel.getRestaurantCity()="+userModel.getRestaurantCity());
		System.out.println("userModel.getRestaurantDistrict()="+userModel.getRestaurantDistrict());
		System.out.println("userModel.getRestaurantStreet()="+userModel.getRestaurantStreet());		
		System.out.println("userModel.getRestaurantAddress()="+userModel.getRestaurantAddress());	
		System.out.println("userModel.getRestaurantTel()="+userModel.getRestaurantTel());
		System.out.println("userModel.getRestaurantOpentime()="+userModel.getRestaurantOpentime());
		System.out.println("userModel.getRestaurantClosetime()="+userModel.getRestaurantClosetime());
		System.out.println("userModel.getRestaurantIndroduction()="+userModel.getRestaurantIndroduction());
		System.out.println("userModel.getManagerPhone()="+userModel.getManagerPhone());
		System.out.println("userModel.getBossPhone()="+userModel.getBossPhone());	
		System.out.println("userModel.getBaseurl()="+userModel.getBaseurl());
		System.out.println("userModel.getViewspath()="+userModel.getViewspath());	
		System.out.println("userModel.getLicensepath()="+userModel.getLicensepath());
		System.out.println("userModel.getContractpath()="+userModel.getContractpath());
		System.out.println("userModel.getAttorneypath()="+userModel.getAttorneypath());
		System.out.println("userModel.getBankaccountName()="+userModel.getBankaccountName());
		System.out.println("userModel.getBankaccountBank()="+userModel.getBankaccountBank());
		System.out.println("userModel.getBankaccountAccount()="+userModel.getBankaccountAccount());
		System.out.println("payNotifyModel.getPay_result()="+payNotifyModel.getPay_result());
		System.out.println("payNotifyModel.getTotal_fee()="+payNotifyModel.getTotal_fee());
		System.out.println("payNotifyModel.getTime_end()="+payNotifyModel.getTime_end());
		System.out.println("payNotifyModel.getOut_trade_no()="+payNotifyModel.getOut_trade_no());*/
		
		
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
			userModel.getRestaurantName(),userModel.getCooperatetype(),
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
