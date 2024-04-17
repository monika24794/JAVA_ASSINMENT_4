//.Write a Java program to remove duplicate characters from a string using StringBuffer.

package assinment4;

import java.util.Scanner;

public class StringBufferDemo {
public static String removeDuplicate(String input) {
boolean character[] = new boolean[122];
StringBuffer sb = new StringBuffer();
for (int i = 0; i < input.length(); i++) {

char test = input.charAt(i);
if (!character[test]) {
sb.append(test);
character[test] = true;
}
}
return sb.toString();
}

public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter the string");
String input = sc.next();
String newString = removeDuplicate(input);
System.out.println("String after removing duplicates "+"'" + newString+"'");

}

}