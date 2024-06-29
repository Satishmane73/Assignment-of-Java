// Program to swap two numbers without using third variable.

import java.util.Scanner;
public class Swap
{
	public static void main(String [] args)
	{
		Scanner scr=new Scanner(System.in);
		int a,b;
		System.out.println("Enter numbers to swap");
		a=scr.nextInt();
		b=scr.nextInt();
		System.out.println("Before Swappig \na = "+a+"\tb = "+b);
	
		//Logit to Swap Two Numbers without Using Third Variable
		a=a+b;   
		b=a-b;
		a=a-b;

		System.out.println("\n\nAfter Swapping\na = "+a+"\tb = "+b);
	}
}