package com.cg.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	//abstract method
	String print() ;
}
class B
{
	@Custom (print="Its Holiday")
	public void display2() 
	{
		System.out.println("Hello");
	}
}


public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException  {
		 B b= new B();
		 b.display2();
		 
		 Method m=b.getClass().getMethod("display2");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		 
	}

}

