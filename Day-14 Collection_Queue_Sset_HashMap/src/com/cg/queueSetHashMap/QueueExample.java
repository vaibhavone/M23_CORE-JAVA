package com.cg.queueSetHashMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class QueueExample {
	
	public static void main(String[] args) {
		NavigableMap<Integer,String> s=new TreeMap<Integer,String>(); 
		// Map<Integer,String> s=new HashMap<Integer,String>();
		// Map<Integer,string> s=new TreeMap<Integer,String>();

		//if you use TreeMap then it will throw exception 
		//maintain ascending order 
		//no null key //many null values 
		System.out.println(s);
		s.put(01, "Sumit");
		s.put(03,"Vaibhav");
		s.put(02, "tejas");
	//	s.put(null, null);
		s.put(04, null);
		System.out.println(s);

		s.remove(03);
		System.out.println(s);
		System.out.println(s.firstEntry());
		System.out.println(s.lastEntry());

	}

}

