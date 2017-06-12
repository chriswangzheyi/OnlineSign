package com.hpf.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  


@Controller  
public class PayNotifyController {
	

	@Scheduled(fixedRate=2000) 
    @RequestMapping(value="/paynotify")
    public String paynotifycallback(HttpServletRequest request) {
    	System.out.println("����paynotifycallback");
    	
    	try {
			InputStream inputStream = request.getInputStream();
			StringBuffer sb= new StringBuffer();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
			String s;

			while((s=in.readLine())!=null){
				sb.append(s);
			}
			
			in.close();
			inputStream.close();
						
	    	String paynotifyrespxml = sb.toString();
	    	System.out.println("respxml"+paynotifyrespxml);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
				return "paynotify"; 
    }
      

}
