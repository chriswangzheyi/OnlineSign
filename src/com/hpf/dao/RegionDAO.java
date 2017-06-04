package com.hpf.dao;

import com.hpf.model.RegionModel;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public interface RegionDAO {
	
	public List getRegionInfo(RegionModel regionModel);

}
