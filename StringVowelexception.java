package assinment4;

import java.util.Scanner;

class MyExep extends Exception
{
	public MyExep (String msg)
	{
		super(msg);
	}
}
public class StringVowelexception {

	public static void main(java.lang.String[] args) {
		boolean containsVowels = false;
		java.lang.String vowel = "AEIOUaeiou";
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the String");
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) 
		{
			char test = input.charAt(i);
			if (vowel.contains(String.valueOf(test)))
			{
			containsVowels = true;
			break;
			}
		}
		if (!containsVowels) {
			throw new MyExep("This String does not contains any vowels");
			}
		else
		System.out.println("The String contains vowels..");
	 } 
	catch (Exception e) {
	 System.out.println(e.getMessage());
	}
	}

}
