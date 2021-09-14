package Mypack;

import java.util.*;

public class Sentance {

	public static void main(String[] args) {
		int upper=0,lower=0;
		int space=0;
		int special=0,digit=0;
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				upper++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lower++;
			}
			else if(ch==' ')
			{
				space++;
			}
			else if (ch>='0' && ch<='9')
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Number of uppercases is "+upper);
		System.out.println("Number of lowercases is "+lower);
		System.out.println("Number of digits is "+digit);
		System.out.println("Number of spaces is "+space);
		System.out.println("Number of Specialcharacters is "+special);

		
		
	}

}
