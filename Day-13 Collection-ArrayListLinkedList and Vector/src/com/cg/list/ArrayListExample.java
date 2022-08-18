package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List obj=new ArrayList<>();
		obj.add(11);
		obj.add("Vaibhav");
		obj.add(89.90);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.lastIndexOf(11));
		System.out.println(obj);
	}

}
