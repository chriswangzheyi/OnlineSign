package com.hpf.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.hpf.util.PayNotifyXMLDecoder;  


@Controller  
public class PayNotifyController {
	


    @RequestMapping(value="/paynotify")
    public String paynotifycallback(HttpServletRequest request) {

    	
    	try {
			InputStream inputStream = request.getInputStream();
			StringBuffer sb= new StringBuffer();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
			String s;

			while((s=in.readLine())!=null){
				sb.append(s);
			}
			
			in.close();
			
	    	if(sb.toString() !=null && !sb.toString().equals("")){
			inputStream.close();			
			
	    	String paynotifyrespxml = sb.toString();


	    	String payresult= PayNotifyXMLDecoder.getXMLInfo(paynotifyrespxml, "pay_result");
	    	}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
				return "paynotify"; 
    }
      

}
