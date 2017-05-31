package com.hpf.controller;




import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller  
public class StepsController {

    
	//初始页面
    @RequestMapping(value="/")  
    public String home(ModelMap model) {      	
    	return "steps";  
    }  

   
    
    @RequestMapping(value="/submit")
    public String fileUpload(@RequestParam("viewfiles") MultipartFile[] viewfiles,
    	    @RequestParam(value = "licensefile", required = false) MultipartFile licensefile,
    		HttpServletRequest request
    		
    		
    		
    		) { 

    	
    	/*上传文件 */   	
    	//多个文件
        if(viewfiles!=null && viewfiles.length>0){  
            for(int i = 0;i<viewfiles.length;i++){  
                MultipartFile file = viewfiles[i];  

                try {
                    //获取存取路径
                    String path = request.getSession().getServletContext().getRealPath("/") + "upload/";
                    String filename=file.getOriginalFilename();                      
                    File FinalFile = new File(path, filename);
                    if(!FinalFile.exists()){  
                    	FinalFile.mkdirs();  
                    }
                    // 转存文件  
                    file.transferTo(FinalFile); 
                } catch (IOException e) {
                    e.printStackTrace();
                }  
            }
            
            //单个文件     
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
            
            
            // 成功
            return "steps"; 
        }  
        // 失败
        return "fail";  
    } 
    
    
    
    
    
    //提交页面
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
