package com.nt.sbeans;

import java.util.Map;

public class StaffRoom {
	
	
	public StaffRoom() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I m StaffRoom class Constructor(4)");
	}

	private  Map<String, Subject> data;


	public void setData(Map<String, Subject> data) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I m StaffRoom setData(5) ");
		this.data = data;
	}

	public void accessData() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I'm accessDate method for accessing all data for map(8)");
			if(data!=null) {
				Thread.sleep(3000);
				System.out.println("Start FOR each Loop(9)");
			for(Map.Entry<String,Subject> entry: data.entrySet() ) {
				Subject sb = entry.getValue();
				Thread.sleep(3000);
				
				System.out.println(sb.getTitle()+"->"+sb.getTeacher());
				Thread.sleep(3000);
				System.out.println("=====================");
				
			}
			}else {
			
				System.out.println("Data Not Found");
			}
				
				
		
	}
	




	
  

}
