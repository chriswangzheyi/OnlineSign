package com.hpf.controller;



import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import com.hpf.model.PhoneValidationModel;
import com.hpf.service.YunPianSmsService;


@Controller  
public class SendSMSController {
	
	
	@Autowired
	private  PhoneValidationModel phoneValidationModel;


        @RequestMapping(value = "/sendsmsformanager")
        public void sendSMSForManager(HttpServletRequest request){
        	
        	String managerphone = request.getParameter("managerphone");

        	phoneValidationModel.setManagerPhone(managerphone);
        	//随机6位验证码
        	int verificationCode =(int) ((Math.random()*9+1)*100000);
        	String content ="【好觅网】您正在修改您的好觅网绑定手机号码，验证码"+verificationCode+"，切勿将验证码泄露于他人，客服电话4009929339";     		
        	YunPianSmsService.YunpianSendSms(managerphone,content,verificationCode);
        }
    
        
        @RequestMapping(value = "/sendsmsforboss")
        public void sendSMSForBoss(HttpServletRequest request){
        	
        	String bossphone = request.getParameter("bossphone");

        	phoneValidationModel.setManagerPhone(bossphone);
        	//随机6位验证码
        	int verificationCode =(int) ((Math.random()*9+1)*100000);
        	String content ="【好觅网】您正在修改您的好觅网绑定手机号码，验证码"+verificationCode+"，切勿将验证码泄露于他人，客服电话4009929339";     		
        	YunPianSmsService.YunpianSendSms(bossphone,content,verificationCode);
        }
    
  
    
       
}
