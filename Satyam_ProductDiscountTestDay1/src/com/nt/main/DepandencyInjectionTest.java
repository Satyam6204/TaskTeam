package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.ProductDiscount;

public class DepandencyInjectionTest {
	
	public static void main(String args[]) {
		System.out.println("DepandencyInjectionTest.main()-Start::::::::::::::::::::>");
		
		ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		ProductDiscount pd=ctx.getBean("pdp",ProductDiscount.class);
		
		String msg =pd.DiscountMethod(324.0);
		
		System.out.println(msg);
		
		ctx.close();
		
		System.out.println("DepandencyInjectionTest.main()-END:::::::::::::::::::::::::>");
		
		
	}

}
