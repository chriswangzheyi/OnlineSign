package com.hpf.util;

import com.hpf.controller.PayNotifyController;

public class Timer {
	
	
	public static void Test(){
		
		int counter=1;
		

		
		while(counter<10){
			  try {
		            Thread.sleep(1000);
		            counter++;
		            

		        } catch (InterruptedException e) {
		            e.printStackTrace(); 
		        }

		}
		
	}
	
	public static void main(String[] args) {
		Test();
	}


}
