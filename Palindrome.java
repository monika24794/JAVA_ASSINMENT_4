//.Write a Java method to check if an input string is a palindrome (Use String functions).

package assinment4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to check palindrome or not");
		String str[]=new String [5];
		for (int i = 0; i < str.length; i++) 
		{
			str[i]=sc.next();
		}
		for (int i = 0; i < str.length; i++) 
		{
			int temp = (str.length-i);
			if (str[i] == str[temp])
				System.out.println("string is palindrom");
			else
				System.out.println("string is not palindrom");
				
		}

	}

}
