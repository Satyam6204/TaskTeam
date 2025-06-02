package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.TrafficLight;

@SpringBootApplication
public class SatyamBootProj04TrafficLightApplication {

	public static void main(String[] args) {
		boolean running =true;
		ApplicationContext ctx =SpringApplication.run(SatyamBootProj04TrafficLightApplication.class, args);
		 

		while(running) {	  
	Scanner sc =new Scanner(System.in);	
		System.out.print("Enter Traffic Light Color\t:");
		
		String name = sc.next();
	
		    TrafficLight tt= ctx.getBean("tl",TrafficLight.class);
	  
		        String msg =tt.Action(name);
		        		System.out.print(name+" -> "+msg);
		        				System.out.println();
		        						System.out.print("Did you want check another Traffic Color So Press Y/N\t:");
		        			String Again=sc.next();
		        	if(Again.equalsIgnoreCase("Y")) {
		        					running = true;
			
		        		}else if(Again.equalsIgnoreCase("N")) {
		        			 sc.close();
		        					running=false;
		        							System.out.println("Thank You For Visit😎");
		        	}else {
		        	     running =false;
		        	     sc.close();
		        				System.out.println("Invalid Option Only 'Y' or 'N ");
		        		}
				}

			}
		}

	
