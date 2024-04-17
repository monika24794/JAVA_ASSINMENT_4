//5.Write a program to calculate the square value of any number given by the user .
//Add an exception handling block to check whether the user enter letters instead of numbers

package assinment4;

import java.util.Scanner;

public class SqureException {

	public static void main(String[] args)throws Exception
	{
		Scanner sc= new Scanner(System.in);
		try
		{
		System.out.println("enter the number");
		java.lang.String num=sc.next();
		int num1=Integer.parseInt(num);
		int squre = num1*num1;
		System.out.println("squre of number"+squre);
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
			System.out.println("plase enter the input in integer ");
		}
		
	}

}