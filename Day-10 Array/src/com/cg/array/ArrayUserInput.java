package com.cg.array;
import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Values:");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the "+ i +" index");
			arr[i]=sc.nextInt();
		}
			for(int i=0; i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}


