package com.hpf.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hpf.dao.StespsDAO;
import com.hpf.model.PayModel;
import com.hpf.model.TypeModel;
import com.hpf.service.GetRegionInfoService;
import com.hpf.service.WechatPay;
import com.hpf.util.UUIDGenerator;



@Controller  
public class StepsController {
	
	@Autowired
	private GetRegionInfoService getRegionInfoService;
	
	@Autowired
	private WechatPay WechatPay;
	
	@Autowired
	PayModel PayModel;
	
	@Autowired
	StespsDAO stepsdao;
	
	@Autowired
	TypeModel TypeModel;
    
	//��ʼҳ��
    @RequestMapping(value="/")  
    public String home(ModelMap model,HttpServletRequest request) { 

    	//����΢��֧����
    	String codeurl=WechatPay.Wchatpayment(); 
    	request.setAttribute("qrcodeurl",codeurl);
    	
    	//��ȡ��������   	
    	List<?> typelist =stepsdao.GetRestaurantType(TypeModel);
    	request.setAttribute("typelist",typelist);
    	    	  	
    	return "steps";  
    }  
    
    
   
    
    @RequestMapping(value="/submit")
    public String fileUpload(@RequestParam("viewfiles") MultipartFile[] viewfiles,
    	    @RequestParam(value = "licensefile", required = false) MultipartFile licensefile,
    		HttpServletRequest request
    		) { 

    	
    	/*�ϴ��ļ� */   	
    	//����ļ�	
        if(viewfiles!=null && viewfiles.length>0){  
            for(int i = 0;i<viewfiles.length;i++){  
                MultipartFile file = viewfiles[i];  

                try {
                    //��ȡ��ȡ·��
                    String path = request.getSession().getServletContext().getRealPath("/") + "upload/";
                    String filename=file.getOriginalFilename();         
                    String prefix=filename.substring(filename.lastIndexOf(".")+1);
                    filename=UUIDGenerator.UUIDGenerator()+"."+prefix;
                    
                    File FinalFile = new File(path, filename);
                    if(!FinalFile.exists()){  
                    	FinalFile.mkdirs();  
                    }
                    // ת���ļ�  
                    file.transferTo(FinalFile); 
                } catch (IOException e) {
                    e.printStackTrace();
                }  
            }
            
            //�����ļ�     
            String path = request.getSession().getServletContext().getRealPath("/") + "upload/";  
            String licenseName = licensefile.getOriginalFilename();
            File licenseFinalFile = new File(path, licenseName);
            if(!licenseFinalFile.exists()){  
                licenseFinalFile.mkdirs();  
            }
            
            try { 	
            	 licensefile.transferTo(licenseFinalFile); 
            	} catch (Exception e) {  
            	 e.printStackTrace();  
            	}  
            
            
            // �ɹ�
            return "steps"; 
        }  
        // ʧ��
        return "fail";  
    } 
    
    
    //���µ�����Ϣ
    @RequestMapping(value="/updateregion") 
    public void updateRegion(HttpServletRequest request){
    	String path = request.getSession().getServletContext().getRealPath("/"+"resources/data");
    	getRegionInfoService.getRegionInformation(path);   	
    }
    
  
    
    //�ύҳ��
/*    @RequestMapping(value="/submit")  
    public String login(@RequestParam("restaurant_province") String restaurantProvince, 
    		@RequestParam("restaurant_city") String restaurantCity,
    		@RequestParam("restaurant_district") String restaurantDistrict,
    		@RequestParam("restaurant_street") String restaurantStreet,
    		@RequestParam("restaurant_type") String restaurantType,
    		@RequestParam("restaurant_address") String restaurantAddress,
    		@RequestParam("restaurant_tel") String restaurantTel,
    		@RequestParam("restaurant_opentime") String restaurantOpentime,
    		@RequestParam("restaurant_closetime") String restaurantClosetime,
    		@RequestParam("restaurant_indroduction") String restaurantIndroduction,
    		@RequestParam("restaurant_addres") String restaurant_addres,
    		@RequestParam("restaurant_view") String restaurantView,
    		@RequestParam("manager_phone") String managerPhone,
    		@RequestParam("boss_phone") String boss_phone,
    		@RequestParam("bankaccount_name") String bankaccountName,
    		@RequestParam("bankaccount_bank") String bankaccountBank,
    		@RequestParam("bankaccount_account") String bankaccountAccount,    		
    		ModelMap model,
    		@ModelAttribute("UserModel") UserModel userModel) {  
    	return "steps";
    }  */
    
       
}
