package Mypack;

import java.util.Scanner;

public class Votting {

	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age ::");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You can Vote!!!");
		}
		else
		{
			System.out.println("You Cannot Vote!!");
		}
	}

}
