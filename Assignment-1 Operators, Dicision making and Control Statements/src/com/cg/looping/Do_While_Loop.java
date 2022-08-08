package com.cg.looping;

import java.util.Scanner;

public class Do_While_Loop {

	
		public class Do_While_loop {

			public void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
				int i=1;
				do
				{
					System.out.print(i+" ");
					i++;
					
				}while(i<=n);
				sc.close();

			}

		}

	}


