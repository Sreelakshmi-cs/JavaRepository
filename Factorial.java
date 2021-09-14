package Mypack;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int num,i;
		int fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to print Factorial ::");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of number is "+fact);
		
	}

}
