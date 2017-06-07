package com.hpf.util;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Component;


@Component
public class XMLDecoder {
	
	
	
	public static void getXMLInfo(String xml){

		String version;
		String charset;
		String sign_type;
		String status;
		String result_code;
		String mch_id;
		String nonce_str;
		String sign;

		
		try {
			Document doc= DocumentHelper.parseText(xml);
			
			//获取根节点
			Element root = doc.getRootElement();
			//获取根节点的所有子节点
			List<Element> elementList= root.elements();
			//获取节点名称
			for(int i=0;i<elementList.size();i++){
				
				if(elementList.get(i).getName().equals("version")){
					version=elementList.get(i).getTextTrim();
					//System.out.println("version="+version);
				}
				
				if(elementList.get(i).getName().equals("charset")){
					charset=elementList.get(i).getTextTrim();
					//System.out.println("charset="+charset);
				}
				
				if(elementList.get(i).getName().equals("sign_type")){
					sign_type=elementList.get(i).getTextTrim();
					//System.out.println("sign_type="+sign_type);
				}
				
				if(elementList.get(i).getName().equals("status")){
					status=elementList.get(i).getTextTrim();
					//System.out.println("status="+status);
				}
				
				
				if(elementList.get(i).getName().equals("result_code")){
					result_code=elementList.get(i).getTextTrim();
					//System.out.println("result_code="+result_code);
				}
				
				if(elementList.get(i).getName().equals("mch_id")){
					mch_id=elementList.get(i).getTextTrim();
					//System.out.println("mch_id="+mch_id);
				}
				
				if(elementList.get(i).getName().equals("nonce_str")){
					nonce_str=elementList.get(i).getTextTrim();
					//System.out.println("nonce_str="+nonce_str);
				}
				if(elementList.get(i).getName().equals("sign")){
					sign=elementList.get(i).getTextTrim();
					//System.out.println("sign="+sign);
				}				
				
			}
				
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	
		
	}
	

}
