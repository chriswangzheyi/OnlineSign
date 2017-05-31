package com.hpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExplainController {
	
    @RequestMapping(value="explain")  
    public String home(ModelMap model) {
    	
    	return "explain";  
    }  
}
