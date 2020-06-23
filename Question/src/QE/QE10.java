package QE;

import java.util.Scanner;

public class QE10 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		int C = num.nextInt();
		num.close();
		
		int sum1;
		int sum2;
		int sum3;
		int sum4;
		
		sum1 = (A+B)%C;
		sum2 = ((A%C) + (B%C))%C;
		sum3 = (A*B)%C;
		sum4 = ((A%C) * (B%C))%C;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

}
