package Mypack;
import java.util.*;

public class Unmatched 
{

	public static void main(String[] args)
	{
		int flag=0;
		int[] arr1={1,2,3};
		int[] arr2={3,4,5};
		for(int i=0;i<arr1.length;i++)
		{
			flag=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.println(arr1[i]);
			}
		}
	}
}
