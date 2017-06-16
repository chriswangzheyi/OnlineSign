package com.hpf.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hpf.model.PayNotifyModel;
import com.hpf.util.PayNotifyXMLDecoder;  


@Controller  
public class PayNotifyController {
	
	private static Log logger = LogFactory.getLog(PayNotifyController.class.getName());
	
	@Autowired
	PayNotifyModel PayNotifyModel;


    @RequestMapping(value="/paynotify") @ResponseBody
    public String paynotifycallback(HttpServletRequest request) {

    	String payresult = "Not pay";
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


	    	payresult= PayNotifyXMLDecoder.getXMLInfo(paynotifyrespxml, "pay_result");
	    	
	    	if(payresult.equals("0")){
	    		PayNotifyModel.setPay_result(payresult);
	    		
	    	String total_fee = PayNotifyXMLDecoder.getXMLInfo(paynotifyrespxml, "total_fee");
	    	String out_trade_no = PayNotifyXMLDecoder.getXMLInfo(paynotifyrespxml, "out_trade_no");
	    	String time_end = PayNotifyXMLDecoder.getXMLInfo(paynotifyrespxml, "time_end");
	    	
	    	PayNotifyModel.setTotal_fee(total_fee);
	    	PayNotifyModel.setOut_trade_no(out_trade_no);
	    	PayNotifyModel.setTime_end(time_end);
	    	
	    	}
	    	
	    	}
			
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("微信支付结果返回出错，",e);
		}
    	
				return payresult; 
    }
      

}
