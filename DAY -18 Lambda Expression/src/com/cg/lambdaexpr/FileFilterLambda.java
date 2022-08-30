package com.cg.lambdaexpr;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//lambda expression for searching the 
		FileFilter f=(File pathname)->pathname.getName().endsWith(".pdf");
		File dir=new File("C:\\Users\\sdesa\\Downloads");
		File contents[]=dir.listFiles(f);
		
		//enhanced for loop
		//if any particular extension file is open your system then you will get that file in two times with $ sign
		for(File i:contents) 
		{
			System.out.println(i);
		}
	}

}

