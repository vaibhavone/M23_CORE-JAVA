package com.cg.queueSetHashMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		Map<Character,String> map=new HashMap<Character,String>();
   map.put('s',"Sumit");
   map.put('v',"Vaibhav");
   map.put('p', "paresh");
   map.put('n',"naresh");
   map.put('k',"karan");
   System.out.println(map);
   map.remove('k');
   for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet())
  {
	  System.out.println(m.getKey()+" "+m.getValue());
	 
  }

	}

}

