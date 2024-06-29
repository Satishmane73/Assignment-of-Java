// program to calculate a Bill without GST or With 18% gst

import java.util.Scanner;
public class Bill
{
	public static void main(String [] args)
	{
		int rate,qty;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Rate and Qty");
		rate=scr.nextInt();
		qty=scr.nextInt();
		
		int bill=rate*qty;    				 // Calculate Bill Without gst
		int Gbill=bill+(bill*18/100); 		 //Calculate Bill with gst

		System.out.println("Bill Without GST = "+bill);
		System.out.println("Bill With GST = "+Gbill);
	} 
}