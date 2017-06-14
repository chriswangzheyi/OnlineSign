package com.hpf.util;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Component;


@Component
public class PayNotifyXMLDecoder {
	
	
	
	public static String getXMLInfo(String xml, String paraExpected){

		String pay_result;
		String total_fee;
		String out_trade_no;
		String time_end;

		
		try {
			Document doc= DocumentHelper.parseText(xml);
			
			//获取根节点
			Element root = doc.getRootElement();
			//获取根节点的所有子节点
			List<Element> elementList= root.elements();
			//获取节点名称
			for(int i=0;i<elementList.size();i++){
				
				if(elementList.get(i).getName().equals("pay_result") && paraExpected.equals("pay_result")){
					pay_result=elementList.get(i).getTextTrim();
					return pay_result;
				}
				
				if(elementList.get(i).getName().equals("total_fee") && paraExpected.equals("total_fee")){
					total_fee=elementList.get(i).getTextTrim();
					return total_fee;
				}	
				
				if(elementList.get(i).getName().equals("out_trade_no") && paraExpected.equals("out_trade_no")){
					out_trade_no=elementList.get(i).getTextTrim();
					return out_trade_no;
				}	
				
				if(elementList.get(i).getName().equals("time_end") && paraExpected.equals("time_end")){
					time_end=elementList.get(i).getTextTrim();
					return time_end;
				}	
				
				
			}
				
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return null;
	
		
	}
	

}
