// program to find Gretest between three number using conditional operator

import java.util.Scanner;
public class Max
{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Three Numbers");		
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		
		// Fing greatest no and return the result
		String res = a>b && a>c ? "A is Greater" : b>a && b>c ? "B is Greater ": "C is Greater";
		
		System.out.println(res);
	}
}