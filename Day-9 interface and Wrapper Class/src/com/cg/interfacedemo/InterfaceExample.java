package com.cg.interfacedemo;

interface A {
	// interface method by default
	abstract void print();

	void display();
}

class B implements A {
	public void print() {
		System.out.println("Technoserve India Foundation");
	}

	@Override
	public void display() {
		System.out.println("Java Full Stack");

	}
}

public class InterfaceExample {

	public static void main(String[] args) {

	}

}
