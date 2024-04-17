package assinment4;

import java.util.Scanner;

public class ExceptionArray
{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		 int[] arr = new int [size];
		 System.out.println("enter the array element");
		 for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		 try
		 {
			 System.out.println("enter the index position to find element");
			 int index= sc.nextInt();
			System.out.println("array index positin"+index+ "elemnt on that position is "+arr[index]);
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			  System.err.println("enter index position between 0 to" +(size-1));
			  System.out.println(e.getMessage());
		 }
		 
		 
	}
}
