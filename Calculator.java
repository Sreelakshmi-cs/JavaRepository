package Practice;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		char ch,st='y';
		int num1,num2;
		int num3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator");
		while(st == 'y')
		{
	
		System.out.println("Enter the number1 : ");
		num1=sc.nextInt();
		System.out.println("Enter the number2 : ");
		num2=sc.nextInt();
		System.out.println("Selct the operation you want to perform");
		System.out.println(" + Addition");
		System.out.println(" - Subtraction");
		System.out.println(" * Multiplcation");
		System.out.println(" / Division");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case '+': System.out.println(num1+" + "+ num2 +" = " + num1+num2 );
				break;
		case '-':num3 =num1-num2;
				System.out.println(num1+" - "+ num2 +" = " + num3 );
				break;
		case '*': System.out.println(num1+" * "+ num2 +" = " + num1*num2 );
				break;
		case '/': System.out.println(num1+" / "+ num2 +" = " + num1/num2 );
		break;
		
		default: System.out.println("Invalid Choice!!");
				break;
			
		}
		System.out.println("Continue? y / n");
		st=sc.next().charAt(0);
		}
	
		
		
		
	}

}
