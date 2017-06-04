package com.hpf.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.hpf.util.MD5;


public class WeChatSignature {
	
	public static String sign(){
		
		String appid="11";
		String mch_id="22";
		String device_info="33";
		String body="44";
		String nonce_str="55";
	
		SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
		parameters.put("appid", appid);
		parameters.put("mch_id", mch_id);
		parameters.put("device_info", device_info);
		parameters.put("body", body);
		parameters.put("nonce_str", nonce_str);
		
		String Key="111111";
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
		
	   sb.append("key="+Key);
		
		String sign = MD5.MD5Encode( sb.toString(),"UTF-8").toUpperCase();
		
		System.err.println("sign:"+sign);
		return null;	
	}
	
	public static void main(String[] args) {
		sign();
	}
	

}
