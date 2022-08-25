package com.cg.queueSetHashMap;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Set s=new HashSet();
     //  Set s=new LinkedHashSet();  //its print as it is  
		s.add(-1);
		s.add(11);
		s.add(2);
		s.add(-11);
        s.add(null);
        System.out.println(s);     
	}

}


