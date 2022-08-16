package com.cg.array;
class Student
{
	public int roll_no;
	public String name;
	//Constructor
	Student(int roll_no, String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}

public class StudentArray {

	public static void main(String[] args) {
		Student[]arr=new Student[3];
		arr[0]=new Student(101,"Rahul");
		arr[1]=new Student(102,"Riya");
		arr[2]=new Student(103,"Rohan");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println();
		}
		
	}

}
