//3.Write a Java program to concatenate all elements of a string array efficiently using StringBuilder
package assinment4;

import java.util.Scanner;

public class StringConcatenateusingSbuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str[]=new String [5];
		for (int i = 0; i < str.length; i++) 
		{
			str[i]=sc.next();
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length; i++)
		{
			sb.append(str[i]);
		}
System.out.println(sb);
	}

}
