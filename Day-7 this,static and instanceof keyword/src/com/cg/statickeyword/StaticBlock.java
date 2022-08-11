package com.cg.statickeyword;
public class StaticBlock {

	 static int num; 
	 static String str;
	
	static 
	{
		num =15;
		str="abc";
	}
	public static void main(String[] args) {
		//if u want initialized value without using constructor  and obj creation then use static block
		//and make variable of class as static
		System.out.println(num);
		System.out.println(str);

	}

}

