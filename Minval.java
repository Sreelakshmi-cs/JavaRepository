package Mypack;

public class Minval 
{

	public static void main(String[] args) 
	{
		int arr[]={1,2,3};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("The minimum value is " +min);
	}
}
