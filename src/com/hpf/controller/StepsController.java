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
import com.hpf.model.UserModel;
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
	
	@Autowired
	UserModel UserModel;
    
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
    	    @RequestParam(value = "contractfile", required = false) MultipartFile contractfile,
    	    @RequestParam(value = "attorneyfile", required = false) MultipartFile attorneyfile,
    		HttpServletRequest request,  		
    		@RequestParam("restaurant_name") String restaurantName, 
    		@RequestParam("restaurant_province") String restaurantProvince, 
    		@RequestParam("restaurant_city") String restaurantCity,
    		@RequestParam("restaurant_district") String restaurantDistrict,
    		@RequestParam("restaurant_street") String restaurantStreet,
    		@RequestParam("restaurant_type") String restaurantType,
    		@RequestParam("restaurant_address") String restaurantAddress,
    		@RequestParam("restaurant_tel") String restaurantTel,
    		@RequestParam("restaurant_opentime") String restaurantOpentime,
    		@RequestParam("restaurant_closetime") String restaurantClosetime,
    		@RequestParam("restaurant_indroduction") String restaurantIndroduction,
    		@RequestParam("manager_phone") String managerPhone,
    		@RequestParam("manager_phone_code") String managerPhoneCode,    		
    		@RequestParam("boss_phone") String bossPhone,
    		@RequestParam("boss_phone_code") String bossPhoneCode,
    		@RequestParam("bankaccount_name") String bankaccountName,
    		@RequestParam("bankaccount_bank") String bankaccountBank,
    		@RequestParam("bankaccount_account") String bankaccountAccount  
    		 		
    		) { 

        UserModel.setRestaurantName(restaurantName);
        UserModel.setRestaurantProvince(restaurantProvince);
        UserModel.setRestaurantCity(restaurantCity);
        UserModel.setRestaurantDistrict(restaurantDistrict);
        UserModel.setRestaurantType(restaurantType);
        UserModel.setRestaurantStreet(restaurantStreet);
        UserModel.setRestaurantAddress(restaurantAddress);
        UserModel.setRestaurantTel(restaurantTel);
        UserModel.setRestaurantOpentime(restaurantOpentime);
        UserModel.setRestaurantClosetime(restaurantClosetime);
        UserModel.setRestaurantIndroduction(restaurantIndroduction);
        UserModel.setManagerPhone(managerPhone);
        UserModel.setManagerPhoneCode(managerPhoneCode);
        UserModel.setBossPhone(bossPhone);
        UserModel.setBossPhoneCode(bossPhoneCode);
        UserModel.setBankaccountName(bankaccountName);
        UserModel.setBankaccountBank(bankaccountBank);
        UserModel.setBankaccountAccount(bankaccountAccount);

    	    	
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
                    
                    System.out.println("����ļ�·��="+path+filename);
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }  
            }
            
            //�����ļ�     
            String path = request.getSession().getServletContext().getRealPath("/") + "upload/";  
            
            String licenseName = licensefile.getOriginalFilename();
            String prefix=licenseName.substring(licenseName.lastIndexOf(".")+1);
            licenseName=UUIDGenerator.UUIDGenerator()+"."+prefix;
            
            String contractName= contractfile.getOriginalFilename();
            prefix=contractName.substring(contractName.lastIndexOf(".")+1);
            contractName=UUIDGenerator.UUIDGenerator()+"."+prefix;
            
            String attorneyName= attorneyfile.getOriginalFilename();
            prefix=attorneyName.substring(attorneyName.lastIndexOf(".")+1);
            attorneyName=UUIDGenerator.UUIDGenerator()+"."+prefix;
            
            
       	 System.out.println("��ͬ·��="+path+licenseName);
       	System.out.println("ִ��·��="+path+licenseName);
       	System.out.println("ί����·��="+path+attorneyName);
            
            File licenseFinalFile = new File(path, licenseName);
            File contractFinalFile = new File(path, contractName);
            File attorneyFinalFile = new File(path, attorneyName);
            
            if(!licenseFinalFile.exists()){  
                licenseFinalFile.mkdirs();  
            }
            
            if(!contractFinalFile.exists()){  
            	contractFinalFile.mkdirs();  
            }
            
            if(!attorneyFinalFile.exists()){  
            	attorneyFinalFile.mkdirs();  
            }
            
            try { 	
            	 licensefile.transferTo(licenseFinalFile); 
            	 contractfile.transferTo(contractFinalFile);
            	 attorneyfile.transferTo(attorneyFinalFile);
            	 
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
             
}
