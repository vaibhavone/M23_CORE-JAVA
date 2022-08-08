package com.cg.dicisionmaking;

import java.util.Scanner;

public class Switch_Statement {

	
		public static class Switch_Statment {

			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				 int a=sc.nextInt();
				 
				switch(a)
				{
				case 1: 
						System.out.println("Erangle");
				break ;
				case 2:
						System.out.println("Miramar");
				break;
				case 3:
						System.out.println("Vekendi");
				break;
				case 4:
						System.out.println("Sanhok");
				default :
						System.out.println("invalid input");
						
						sc.close();
				}

			}

		}
	}

