package com.hpf.controller;



import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hpf.model.PhoneValidationModel;
import com.hpf.service.YunPianSmsService;


@Controller
public class SendSMSController {
	
	
	@Autowired
	private  PhoneValidationModel phoneValidationModel;


        @RequestMapping(value = "/sendsmsformanager") @ResponseBody
        public String sendSMSForManager(HttpServletRequest request){
        	
        	
        	String managerphone = request.getParameter("managerphone");

        	phoneValidationModel.setManagerPhone(managerphone);
        	//���6λ��֤��
        	int verificationCode =(int) ((Math.random()*9+1)*100000);
        	String content ="��~��֤��"+verificationCode+",������ĵ곤�ֻ����롣";     		
        	YunPianSmsService.YunpianSendSms(managerphone,content,verificationCode);
          	      	
        	return String.valueOf(verificationCode);
        }
    
        
        @RequestMapping(value = "/sendsmsforboss") @ResponseBody
        public String sendSMSForBoss(HttpServletRequest request){
        	
        	String bossphone = request.getParameter("bossphone");

        	phoneValidationModel.setManagerPhone(bossphone);
        	//���6λ��֤��
        	int verificationCode =(int) ((Math.random()*9+1)*100000);
        	String content ="��~��֤��"+verificationCode+",��������ϰ��ֻ����롣";  
        	YunPianSmsService.YunpianSendSms(bossphone,content,verificationCode);
               	
        	return String.valueOf(verificationCode);
        }
    
  
    
       
}
