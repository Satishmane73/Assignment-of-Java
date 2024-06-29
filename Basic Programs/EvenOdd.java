import java.util.Scanner;

// Program for Even and Odd
class EvenOdd
{
	public static void main(String [] args)
	{
		int no;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a no to find this is even or odd");
		no=scr.nextInt();
		
		//logic to cheack no is even or odd
		String res=no==0 ? "zero" : no%2!=0 ? "odd" : "even";

		System.out.println("No is "+res);
	}
}