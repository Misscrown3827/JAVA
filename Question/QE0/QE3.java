package QE0;

import java.util.Scanner;

public class QE3 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		num.close();
				
		// A가 4의 배수이다.
		// == 0은 나머지가 0일 때
		// 윤년
		if(A%4 == 0) // A가 4의 배수이고
		{
			if(A%100 == 0 && A%400 != 0)// A가 100의 배수이거나 400의 배수가 아닐 경우 
				System.out.println("0");// 윤년이 아님
			else
				System.out.println("1");// A가 100의 배수가 아니거나 400의 배수 일 경우
		}								// 윤년
		else
		{
			System.out.println("0"); // A가 4의 배수가 아닐 경우
		}
		
	}
	
}
