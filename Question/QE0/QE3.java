package QE0;

import java.util.Scanner;

public class QE3 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		num.close();
				
		// A�� 4�� ����̴�.
		// == 0�� �������� 0�� ��
		// ����
		if(A%4 == 0) // A�� 4�� ����̰�
		{
			if(A%100 == 0 && A%400 != 0)// A�� 100�� ����̰ų� 400�� ����� �ƴ� ��� 
				System.out.println("0");// ������ �ƴ�
			else
				System.out.println("1");// A�� 100�� ����� �ƴϰų� 400�� ��� �� ���
		}								// ����
		else
		{
			System.out.println("0"); // A�� 4�� ����� �ƴ� ���
		}
		
	}
	
}
