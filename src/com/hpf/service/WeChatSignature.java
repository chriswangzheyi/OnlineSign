package com.hpf.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.hpf.model.PayModel;
import com.hpf.util.MD5;


public class WeChatSignature {
	
	public static String sign(PayModel paymodel){
		

	
		SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
		parameters.put("appid", paymodel.getAppid());
		parameters.put("mch_id", paymodel.getMch_id());
		parameters.put("device_info", paymodel.getDevice_info());
		parameters.put("body", paymodel.getBody());
		parameters.put("nonce_str", paymodel.getNonce_str());
		parameters.put("key", paymodel.getKey());
		parameters.put("mch_create_ip", paymodel.getMch_create_ip());
		parameters.put("notify_url", paymodel.getNotify_url());
		
		

		StringBuffer sb = new StringBuffer();
		Set es= parameters.entrySet();
		Iterator<?> it = es.iterator();
		
		while(it.hasNext()){
		@SuppressWarnings("rawtypes")
		Map.Entry entry = (Entry) it.next();
		String k = (String) entry.getKey();
		Object v = entry.getValue();
			
			if(v !=null && !"".equals(v) && !"sign".equals(k)){
				sb.append(k+"="+v+"&");
			}
		}
		
	   sb.append("key="+paymodel.getKey());
		
		String sign = MD5.MD5Encode( sb.toString(),"UTF-8").toUpperCase();
		
		System.err.println("sign:"+sign);
		return null;	
	}	

}
