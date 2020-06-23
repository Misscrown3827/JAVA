package QE;

import java.util.Scanner;

public class QE7 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		
		int multiply;
		
		if(A>0 && B<10)
		{
			multiply = A * B;
			
			System.out.println(multiply);	
		}
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
	}

}
