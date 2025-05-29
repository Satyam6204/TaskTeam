package com.nt;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.SeasonService;

@SpringBootApplication
public class SatyamBootProj01LabTask01Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SatyamBootProj01LabTask01Application.class, args);

        SeasonService ss = ctx.getBean("sf",SeasonService.class);
        Scanner sc = new Scanner(System.in);

        System.out.println("::::::::::::::::::::::::::::::::: Welcome To Season Checker Console ::::::::::::::::::::::::::::::::::::\n");

        boolean r = true;

        while (r) {
            System.out.print("Enter Month Number TO Check Season\t: ");
            
            if(sc.hasNextInt()) {
            int num = sc.nextInt();

            String msg = ss.getSeason(num);
            System.out.println(msg);
        }else {
        	System.out.println("Enter Only 1-12 values Please");
        	sc.next();
        	continue;
        }

            System.out.print("You want to check another month season? (Y/N): ");
            String ans = sc.next();

            if (ans.equalsIgnoreCase("Y")) {
                r = true;
            } else if (ans.equalsIgnoreCase("N")) {
                r = false;
                System.out.println("Thank You Using Our Service🤠");
            } else {
                System.out.println("Only Y and N are allowed. Exiting.");
                System.out.println("Thank You Using Our Service🤠");
                r = false;
            }
        }

        sc.close();
        ((ConfigurableApplicationContext) ctx).close();
    }
}
