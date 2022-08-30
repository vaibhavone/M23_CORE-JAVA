package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<>();
		obj.add(55);
		obj.add(45);
		obj.add(35);
		obj.add(25);
		obj.add(15);
		System.out.println(obj);
		
		//if i want to extract this set values we can go ahead with Iterator,while loop and 
		//for loop but using stream API forEach() method we can do it in a one line
		//extracting the values from Set
		obj.forEach(System.out::println);
		
		

	}

}


