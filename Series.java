package Mypack;

import java.util.*;

public class Series {

	public static void main(String[] args) {
		int a=1,b=2,c=2;
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number to which count series to be printed::");
		num=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<num;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a*b;
			
		}
		}
}
