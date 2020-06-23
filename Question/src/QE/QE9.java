package QE;

import java.util.Scanner;

public class QE9 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		num.close();
		
		int sum; // 더하기
		int minsu; // 빼기
		int multiply; // 곱하기
		int division; // 나누기
		int percent;
		
		sum=A+B;
		minsu=A-B;
		multiply=A*B;
		division=A/B;
		percent=A%B;
		
		if(1<=A && B<=10000)
		{
			System.out.println(sum);
			System.out.println(minsu);
			System.out.println(multiply);
			System.out.println(division);
			System.out.println(percent);
		}
		
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
	}

}
