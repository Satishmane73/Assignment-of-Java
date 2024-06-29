// Program to cheack profit or loss

import java.util.Scanner;

public class ProfitLoss
{
	public static void  main(String [] args)
	{
		int cp,sp;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Cost Price and Sell price");
		cp=scr.nextInt();
		sp=scr.nextInt();

		String res = sp > cp ? "Profit" : cp > sp ? "loss" : "No loss no profit";

		System.out.println(res);
	}
}