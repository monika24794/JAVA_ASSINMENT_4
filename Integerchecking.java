package assinment4;

import java.util.Scanner;
import java.lang.*;
public class Integerchecking {

	public static void main(String[] args)
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
		catch (NumberFormatException e) {
			System.out.println("plase inter number  in intger range");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("plase inter number  in intger range");
			System.out.println(e.getMessage());
		}
		finally
		{
			sc.close();
		}

	}

}
