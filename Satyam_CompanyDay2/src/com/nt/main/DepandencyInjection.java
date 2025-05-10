package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Company;

public class DepandencyInjection {

    public static void main(String[] args) {
       
     ClassPathXmlApplicationContext ctx= 
    		 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");       
     
     Company sd =ctx.getBean("Comp",Company.class);	
     
     String msg = sd.ShowDepartment();
     
     System.out.println(msg);
     
     ctx.close();
     
     System.out.println("Main End ::::::::::::::::::::::::::>");
     
     
     
     
     
    }

}
