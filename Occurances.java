package Mypack;

import java.util.*;

public class Occurances {

	public static void main(String[] args) {
		String str;
		int count=0;
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string starting with a");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='A')
			{
				count++;
			}
		}
		System.out.println("The number of occurences of a/A is ::"+count);
	}

}
