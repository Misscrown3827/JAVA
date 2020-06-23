package QE;

import java.util.Scanner;

public class QE11 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		
		String B = num.next();
		
		num.close();
		
		System.out.println(A*(B.charAt(2) - '0'));
		System.out.println(A*(B.charAt(1) - '0'));
		System.out.println(A*(B.charAt(0) - '0'));
		System.out.println(A*Integer.parseInt(B));
	}

}
