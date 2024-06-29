// Program to find sum of all elemnt in array

import java.util.Scanner;
public class ArraySum
{
	public static void main(String []args)
	{
		int []a=new int[5];
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scr.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]; 		//logic to calculate sum;
		}
		System.out.println("Sum of array elemnt is= "+sum);
	}
}