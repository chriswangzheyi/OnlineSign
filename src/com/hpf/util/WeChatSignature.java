package com.hpf.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

import com.hpf.util.MD5;



public class WeChatSignature {
	
	public static String sign(SortedMap<Object, Object> parameters, String Key){
		

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

		return sign;	
	}	

}
