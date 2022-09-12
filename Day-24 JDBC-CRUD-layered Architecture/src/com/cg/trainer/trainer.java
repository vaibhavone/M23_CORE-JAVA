package com.cg.trainer;

import java.util.List;
import java.util.Scanner;

import com.cg.entities.Student;
import com.cg.services.StudentService;
import com.cg.services.StudentServiceImpl;

public class trainer {
	public static void main(String[] args) {
		StudentService  service=new StudentServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter the choice "
					+"1. Retrieve a particular Student"
					+"2.Retrieve all Students"
					+"3.Delete an Student"
					+"4.Insert an Student"
					+"5.Update an Student"
					+"-1:Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
					System.out.println("Enter the ID to retrieve Student");
					Student s;
					try
					{
						s=service.getStudent(sc.nextInt());
					}
					catch(Exception e1)
					{
						s=null;
					}
					if(s!=null)
						System.out.println(s);
					else
						System.out.println("Student details not found");
			}
			break;
			case 2:
			{
				List<Student>s=service.getstudents();
				for(Student i:s)
				{
					System.out.println(i);
				}
			}
			break;
			case 3:
			{
				System.out.println("Enter the ID to delete Student");
				boolean success=service.deleteStudent(sc.nextInt());
				if(success)
				{
					System.out.println("Successfully deleted");
				}
				else
					System.out.println("Details not found");
			}
			break;
			case 4:
			{
				System.out.println("Enter the details of  Student");
				Student s=new Student(sc.nextInt(),sc.nextLine());
				if(service.AddStudent(s))
				{
					System.out.println("Successfully added");
				}
				else
					System.out.println("Something went wrong in creation");
			}
			break;
			case 5:
			{
				System.out.println("Enter the ID  of  Student that u want to update");
				Student s=new Student();
				s.setID(sc.nextInt());
				System.out.println("Enter the update details");
				sc.nextLine();
				s.setSname(sc.nextLine());
				Student s1=service.updateStudent(s);
				
				if(s1!=null)
					System.out.println(s1);
				else
					System.out.println("Student details not found");
			}
			break;
			case -1:
			{
				System.out.println("Thank You and Exit");
			}
			break;
			default:
			{
				System.out.println("Invalid choice");
			}
			break;
			}
		}while(choice>0);
	}
}

