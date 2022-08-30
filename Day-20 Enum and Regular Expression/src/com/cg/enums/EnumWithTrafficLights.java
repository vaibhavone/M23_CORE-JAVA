package com.cg.enums;

enum TrafficLight
{
	RED(30),YELLOW(10),GREEN(30);
	
	private final int seconds;

	private TrafficLight(int seconds) 
	{
		this.seconds=seconds;
	}

	public int getSeconds() 
	{
		return seconds;
	}
}
public class EnumWithTrafficLights {

	public static void main(String[] args) {
		for(TrafficLight i:TrafficLight.values()) 
		{
			//value() method is used to access all the value inside the constants
			System.out.printf("%s: %d seconds \n",i,i.getSeconds());
		}
		
	}

}

