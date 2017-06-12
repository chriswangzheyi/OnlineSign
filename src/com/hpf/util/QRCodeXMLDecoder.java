package com.hpf.util;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hpf.model.PayModel;


@Component
public class QRCodeXMLDecoder {
	
	
	public static String getXMLInfo(String xml, String paraExpected){

		String version;
		String charset;
		String sign_type;
		String status;
		String result_code;
		String mch_id;
		String nonce_str;
		String sign;
		String code_url;
		
		System.out.println("进入方法的xml="+xml);
		System.out.println("进入方法的paraExpected="+paraExpected);
		
		try {
			Document doc= DocumentHelper.parseText(xml);
			
			//获取根节点
			Element root = doc.getRootElement();
			//获取根节点的所有子节点
			List<Element> elementList= root.elements();
			//获取节点名称
			for(int i=0;i<elementList.size();i++){
				
				if(elementList.get(i).getName().equals("version") && paraExpected.equals("vision")){
					version=elementList.get(i).getTextTrim();
					return version;
				}
				
				if(elementList.get(i).getName().equals("charset") && paraExpected.equals("charset")){
					charset=elementList.get(i).getTextTrim();
					return charset;
				}
				
				if(elementList.get(i).getName().equals("sign_type") && paraExpected.equals("sign_type")){
					sign_type=elementList.get(i).getTextTrim();
					return sign_type;
				}
				
				if(elementList.get(i).getName().equals("status") && paraExpected.equals("status")){
					status=elementList.get(i).getTextTrim();
					return status;
				}
				
				
				if(elementList.get(i).getName().equals("result_code")&& paraExpected.equals("result_code")){
					result_code=elementList.get(i).getTextTrim();
					return result_code;
				}
				
				if(elementList.get(i).getName().equals("mch_id") && paraExpected.equals("mch_id")){
					mch_id=elementList.get(i).getTextTrim();
					return mch_id;
				}
				
				if(elementList.get(i).getName().equals("nonce_str") && paraExpected.equals("nonce_str")){
					nonce_str=elementList.get(i).getTextTrim();
					return nonce_str;
				}
				if(elementList.get(i).getName().equals("sign") && paraExpected.equals("sign")){
					sign=elementList.get(i).getTextTrim();
					return sign;
				}	
				
				if(elementList.get(i).getName().equals("code_url") && paraExpected.equals("code_url")){
					
					System.out.println("111111111111111111111进来了");
					code_url=elementList.get(i).getTextTrim();
					return code_url;
					
				}	
				
			}
				
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return null;
	
		
	}
	

}
