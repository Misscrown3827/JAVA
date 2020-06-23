package QE;

import java.util.Scanner;

public class QE6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		num.close();
		
		if(A>0 && B<10)
		{
			
		int minus;
		
		minus = A-B;
		
		System.out.println(minus);
		
		}
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}
