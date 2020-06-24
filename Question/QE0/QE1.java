package QE0;

import java.util.Scanner;

public class QE1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		num.close();
		
		if(A>B)
		{
			System.out.println(">");
		}
		else if(A<B)
		{
			System.out.println("<");
		}
		else if(A==B)
		{
			System.out.println("==");
		}

	}

}
