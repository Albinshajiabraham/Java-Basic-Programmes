package year;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a year");
		n=in.nextInt();
		if(n%400==0||(n%100!=0&&n%4==0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
		
	

	}

}
