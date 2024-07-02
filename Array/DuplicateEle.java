//program to find duplicate elements in array
import java.util.Scanner;
public class DuplicateEle
{
	public static void main(String [] arrgs)
	{
		int []a=new int[5];
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scr.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count++;
				}
			}
		}
		System.out.println("Duplicate Element in Array"+count);
	}
}