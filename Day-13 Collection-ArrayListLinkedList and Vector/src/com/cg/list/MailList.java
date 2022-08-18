package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address
{
	private int plotNo;
	private String Street;
	private String area;
	private String City;
	private String state;
	
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		Street = street;
		this.area = area;
		City = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, area=%s, City=%s, state=%s]", plotNo, Street, area, City,
				state);
	}

	
	}
	
	


public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//add elements to the list
		obj.add(new Address(121,"Lane no2","Airoli","Navi Mumbai","Maharastra"));
		obj.add(new Address(121,"Lane no3","Hinjewadi","Pune","Maharastra"));
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
			
		}
		System.out.println();

	}

}
