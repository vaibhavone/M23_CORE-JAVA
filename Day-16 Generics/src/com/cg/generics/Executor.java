package com.cg.generics;
public class Executor {
	public static void main(String[] args) {
		Sender<String> obj=new Sender<>();
		obj.setMessege("Generic class demo");
		obj.sendmessege();
		System.out.println();
		
		// create an email object to be send using sender 
		Email em=new Email();
		em.setFrom("sdesale50@gmail.com");
		em.setTo("sumitdesale9@gmail.com");
		em.setSubject("full stack");
	   em.setBody("About training process");
	   System.out.println(em.getBody());
	   
	   //create sender to send email 
	   Sender<Email>obj1=new Sender<Email>();
	  obj1.setMessege(em);
	
	  obj1.sendmessege();
	 
	 
	}

}

