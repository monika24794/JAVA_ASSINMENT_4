package assinment4;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExceptionStringwithStringToken {

	public static void main(String[] args)
	{
		StringTokenizer st =new StringTokenizer("hello world");
		try
		{
	  
		System.out.println( st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
//		String token1 =st.nextToken();
//		System.out.println( token1);
//		String token2 =st.nextToken();
//		System.out.println(token2);
//		String token3 =st.nextToken();
//		System.out.println(token3);
		}
		catch(NoSuchElementException n)
		{
			System.out.println("thre are no addtional tolken to show");
			System.out.println(n.getStackTrace());
		}
	}

}
