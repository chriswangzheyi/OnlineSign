package com.hpf.util;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Component;


@Component
public class PayNotifyXMLDecoder {
	
	
	
	public static void getXMLInfo(String xml){

		String pay_result;

		
		try {
			Document doc= DocumentHelper.parseText(xml);
			
			//��ȡ���ڵ�
			Element root = doc.getRootElement();
			//��ȡ���ڵ�������ӽڵ�
			List<Element> elementList= root.elements();
			//��ȡ�ڵ�����
			for(int i=0;i<elementList.size();i++){
				
				if(elementList.get(i).getName().equals("pay_result")){
					pay_result=elementList.get(i).getTextTrim();
				}			
				
			}
				
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	
		
	}
	

}