package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		 LinkedList obj=new  LinkedList<>();
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
