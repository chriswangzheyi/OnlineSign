package com.hpf.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class Generator {
	
	//��������ַ���
	public static String getRandomNonceStr(int length){
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<length;++i){
			int Number = random.nextInt(3);
			long result =0;
			
			switch (Number) {
			case 0: //Сд��ĸ
				result = Math.round(Math.random()*23+65);
				sb.append(String.valueOf( (char)result));
				break;
				
			case 1: //��д��ĸ
				result = Math.round(Math.random()*25+97);
				sb.append(String.valueOf( (char)result));
				break;

			case 2:
				result = new Random().nextInt(10);
				sb.append(String.valueOf( result));
				break;
		}			
		}
		return sb.toString();	
	}
	
	
	//����out_trade_no
	public static String getCurrentTime(){
	Date now = new Date();
	SimpleDateFormat outformat = new SimpleDateFormat("yyyyMMddHHmsss");
	String s = outformat.format(now);
	return s;
	}

}
