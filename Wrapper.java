//1.Write a Java program that compares two wrapper objects for equality and demonstrates 
//when to use equals() instead of == (try with Integer or Float classes)

package assinment4;

public class Wrapper {

	public static void main(String[] args) {

		Integer num1 = 12345;
		Integer num2 = 56321;
		Float fnum1 = 123.12f;
		Float fnum2 = 123.12f;
		
		
		System.out.println("=========================================================");
		System.out.println("compare using equal() method");
		if (num1.equals(num2))
			System.out.println("integer wrapper objects are equal");
		else
			System.out.println("integer wrapper objects are  not equal");
		System.out.println("=========================================================");
		
		System.out.println("compare using equal() method");
		if (fnum1.equals(fnum2))
			System.out.println("float wrapper objects are equal");
		else
			System.out.println("float wrapper objects are  not equal");
		System.out.println("=========================================================");
	}

}
