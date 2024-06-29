//Program to enter array and Display it

import java.util.Scanner;
public class Arrayip
{
	public static void main(String []args)
	{
		int []a=new int[5];
		Scanner scr=new Scanner(System.in);

		//take array element from user by using for loop;

		System.out.println("enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scr.nextInt();
		}
		System.out.println("Display Element of Array");

		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]-----> "+a[i]);
		}
		
	}
}