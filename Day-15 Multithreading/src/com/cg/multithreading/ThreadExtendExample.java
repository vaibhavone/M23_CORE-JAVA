package com.cg.multithreading;

public class ThreadExtendExample extends Thread
{
public void run()

{
	System.out.println("thread is going to run");
	
}
     public static void main(String[] args) {
		ThreadExtendExample t=new ThreadExtendExample();
		t.start(); //start method automatically call run method  
	   //  t.start(); // already thread is running so you cannot run again so it will throw exception
       t.run();
        t.run();
        
	}

}

