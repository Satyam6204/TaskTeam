package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.sbeans.Books;

public class Test {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
        Books st = ctx.getBean("d", Books.class);
        
        String msg = st.showAllBooks();
        
        System.out.println(msg);
        
        ctx.close(); 
    }

}
