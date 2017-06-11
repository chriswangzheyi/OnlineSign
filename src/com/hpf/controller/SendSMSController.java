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
        	//���6λ��֤��
        	int verificationCode =(int) ((Math.random()*9+1)*100000);
        	String content ="�����������������޸����ĺ��������ֻ����룬��֤��"+verificationCode+"��������֤��й¶�����ˣ��ͷ��绰4009929339";     		
        	YunPianSmsService.YunpianSendSms(managerphone,content,verificationCode);
        }
    
        
        @RequestMapping(value = "/sendsmsforboss")
        public void sendSMSForBoss(HttpServletRequest request){
        	
        	String bossphone = request.getParameter("bossphone");

        	phoneValidationModel.setManagerPhone(bossphone);
        	//���6λ��֤��
        	int verificationCode =(int) ((Math.random()*9+1)*100000);
        	String content ="�����������������޸����ĺ��������ֻ����룬��֤��"+verificationCode+"��������֤��й¶�����ˣ��ͷ��绰4009929339";     		
        	YunPianSmsService.YunpianSendSms(bossphone,content,verificationCode);
        }
    
  
    
       
}
