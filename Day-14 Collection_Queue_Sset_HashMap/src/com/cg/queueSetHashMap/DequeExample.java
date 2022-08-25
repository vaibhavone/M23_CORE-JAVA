package com.cg.queueSetHashMap;

import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		
			ArrayDeque a= new ArrayDeque();
			a.add("world");
			a.add(0);
			System.out.println(a);
			a.addFirst("heyy");
			a.addLast(1);
			System.out.println(a);
			a.removeFirst();
			a.removeLast();
			System.out.println(a);
			System.out.println(a.peek());

		}

	}

	