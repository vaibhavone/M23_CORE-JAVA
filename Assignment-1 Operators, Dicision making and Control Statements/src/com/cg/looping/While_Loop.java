package com.cg.looping;
import java.util.Scanner;
public class While_Loop {

	
		public class While_loop {

			public void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int i=1;
				while(i<=n) 
				{
					System.out.print(i+" ");
					i++;
				}
				sc.close();
			}

		}
	}

