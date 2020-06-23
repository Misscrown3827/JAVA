package QE;

import java.util.Scanner;

public class QE8 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		double A = num.nextInt();
		double B = num.nextInt();
		
		double division;
		
		if(A>0 && B<10)
		{
			division = A/B;
			System.out.println(division);
		}
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}
