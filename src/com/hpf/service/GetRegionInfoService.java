package com.hpf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.hpf.dao.RegionDAO;
import com.hpf.model.RegionModel;

@Component
public class GetRegionInfoService {
	
	@Autowired
	private RegionDAO regionDAO;
	
	@Autowired
	private RegionModel regionModel;
	
	
	public List getRegionInformation(String currentpath){
		regionDAO.getRegionInfo(regionModel,currentpath);
		return null;
		
	}
	

}
