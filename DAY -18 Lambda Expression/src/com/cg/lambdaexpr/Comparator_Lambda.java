package com.cg.lambdaexpr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Lambda {

	public static void main(String[] args) {
		Comparator<String>obj=(s1,s2)->Integer.compare(
				s1.length(),s2.length());
		
		String str[]= {"sumit","vaibhav","ashu","shubham"};
		//sort method will arrange the string in terms of their length
		Collections.sort(Arrays.asList(str),obj);
		for(String i:str)
		{
			System.out.println(i+ " ");
		}
	}

}

