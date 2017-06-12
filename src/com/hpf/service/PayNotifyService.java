package com.hpf.service;

import org.springframework.stereotype.Component;

import com.hpf.util.QRCodeXMLDecoder;


@Component
public class PayNotifyService {
	
	
	public boolean PayNotifyResponseXMLDecoder(String paynotifyxml){
		
		//QRCodeXMLDecoder.getXMLInfo(paynotifyxml);
		
		return true;
		
	}
	

}
