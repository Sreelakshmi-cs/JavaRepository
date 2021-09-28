package Mypack;

import java.util.*;

public class NameFormat 
{

	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :: ");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.substring(0,i+1));
		}
	}

}
