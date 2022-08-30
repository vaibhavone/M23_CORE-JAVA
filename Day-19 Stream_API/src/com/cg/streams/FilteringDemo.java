package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(11,22,33,44);
		//filter(predicate)method
		obj.stream().filter(i->i>25).forEach((i)->System.out.println(i+" "));
		System.out.println();
		
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		

	}

}

