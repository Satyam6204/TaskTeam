package com.nt.sbeans;

public class Subject {
	
	private String title;
	
	/**
	 * @return the title
	 * @throws InterruptedException 
	 */
	public String getTitle() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I m getTitle from Subject(10)");
		return title;
	}
	/**
	 * @return the teacher
	 * @throws InterruptedException 
	 */
	public String getTeacher() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I m getTeacher from Subject(11)");
		return teacher;
	}
	private String teacher;
	/**
	 * @param title the title to set
	 * @throws InterruptedException 
	 */
	public void setTitle(String title) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I m setTitle from Subject(2)");
		this.title = title;
	}
	/**
	 * @param teacher the teacher to set
	 * @throws InterruptedException 
	 */
	public void setTeacher(String teacher) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I m setTeacher from Subject(3)");
		this.teacher = teacher;
	}
	
	
	
	

}
