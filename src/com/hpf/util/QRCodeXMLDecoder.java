package com.hpf.util;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Component;


@Component
public class QRCodeXMLDecoder {
	
	private static Log logger = LogFactory.getLog(QRCodeXMLDecoder.class.getName());
	
	public static String getXMLInfo(String xml, String paraExpected){

		String code_url;
				
		try {
			Document doc= DocumentHelper.parseText(xml);
			
			//��ȡ���ڵ�
			Element root = doc.getRootElement();
			//��ȡ���ڵ�������ӽڵ�
			List<Element> elementList= root.elements();
			//��ȡ�ڵ�����
			for(int i=0;i<elementList.size();i++){				
				if(elementList.get(i).getName().equals("code_url") && paraExpected.equals("code_url")){
					code_url=elementList.get(i).getTextTrim();
					return code_url;			
				}	
				
			}
				
			
		} catch (DocumentException e) {
			e.printStackTrace();
			logger.error("����QRcodeʧ�ܣ�",e);
		}
		
		return null;
	
		
	}
	

}
