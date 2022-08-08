package com.cg.dicisionmaking;

public class Nasted_If_Else {

	
			public static void main(String[] args) {
				int age=12,weight=66;
				
				if(age>=10) 
				{
					if(weight>=55) 
					{
						if(weight<=100) 
						{
							System.out.println("you are eligible for water slides");
						}
						else
						{
							System.out.println("extra charges will be added Because of over Age");
						}
						
					}
					else 
					{
						System.out.println("you are not eligible because of under Weight");
					}

				}
				else 
				{
					System.out.println("you are not eligible Beacause of under Age");
				}
			
			
	}

}
