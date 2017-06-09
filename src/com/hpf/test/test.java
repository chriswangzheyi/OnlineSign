package com.hpf.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {
	
	public static void writeByBufferedReader(String savefilepath) {  
        try {  
  
            String content = "This is the content to write into file";  
            File file = new File("E:/1.txt");  
            // if file doesnt exists, then create it  
            if (!file.exists()) {  
                file.createNewFile();  
            }  
            FileWriter fw = new FileWriter(file, true);  
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(content);  
            bw.flush();  
            bw.close();  
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    } 
	
	
	public static void main(String[] args) {
		writeByBufferedReader("");
	}
	
}
