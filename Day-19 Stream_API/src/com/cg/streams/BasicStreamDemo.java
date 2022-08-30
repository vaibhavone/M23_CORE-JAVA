package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo 
{

	public static void main(String []args) 
	{
		//Stream can be created with static data
		Stream<String>obj=Stream.of("Sumit","Ashu","vaibhav","shubham");
		//forEach is a terminal operation
		obj.forEach((i)->System.out.print(i+" "));
		System.out.println();
		
		//Stream can be accquired from array or collection
		List<String>obj1=Arrays.asList(new String[] {"22","555","66","88"});
		obj=obj1.stream();
		obj.forEach(System.out::println);
		
	}
}

