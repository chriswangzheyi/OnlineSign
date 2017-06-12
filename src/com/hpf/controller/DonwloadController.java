package com.hpf.controller;

import java.io.File;  
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;  
import org.springframework.context.annotation.Scope;  
import org.springframework.http.HttpHeaders;  
import org.springframework.http.HttpStatus;  
import org.springframework.http.MediaType;  
import org.springframework.http.ResponseEntity;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
  
@Controller
@Scope("prototype")     
public class DonwloadController  
{  
  
    @RequestMapping("/downloadcontract")    
    public ResponseEntity<byte[]> downloadcontract(HttpServletRequest request) throws IOException {    
 
        String path = request.getSession().getServletContext().getRealPath("/");
        String filename= "test.txt";
        path = path+"/download/" ;  
                
        File file=new File(path+filename); 
        HttpHeaders headers = new HttpHeaders();    
        String fileName=new String("test.txt".getBytes("UTF-8"),"iso-8859-1");  
        headers.setContentDispositionFormData("attachment", fileName);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                                          headers, HttpStatus.CREATED);    
    }    
    
    
    @RequestMapping("/downloadattorney")    
    public ResponseEntity<byte[]> downloadatto(HttpServletRequest request) throws IOException {    
 
        String path = request.getSession().getServletContext().getRealPath("/");
        String filename= "attorney.txt";
        path = path+"/download/" ;  

                
        File file=new File(path+filename); 
        HttpHeaders headers = new HttpHeaders();    
        String fileName=new String("attorney.txt".getBytes("UTF-8"),"iso-8859-1");  
        headers.setContentDispositionFormData("attachment", fileName);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                                          headers, HttpStatus.CREATED);    
    } 
    
}  