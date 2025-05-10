package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Company;

public class CompanyDepandencyTest {

	public static void main(String[] args)throws ClassNotFoundException {
		
		System.out.println("CompanyDepandencyTest.main()_START");
	
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
	   Company c=ctx.getBean("data",Company.class);
		
		String msg = c.showDepartment();
		
		System.out.println(msg);
		
		System.out.println("CompanyDepandencyTest.main()_END");
	}

}
