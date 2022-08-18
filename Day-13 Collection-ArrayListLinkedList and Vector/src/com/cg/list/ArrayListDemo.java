package com.cg.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>obj=new ArrayList<Integer>();
		obj.add(12);
		obj.add(22);
		System.out.println(obj);
		System.out.println(obj.contains(5));
		System.out.println(obj.get(1));
		obj.set(0,13);
		System.out.println(obj);
		//copy one list into another
		Object copy;
		copy=obj.clone();
		System.out.println(copy);
		obj.addFirst(9);
		obj.addLast(11);
		System.out.println(obj);

	}

}
