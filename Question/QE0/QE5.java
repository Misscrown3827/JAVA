package QE0;

import java.util.Scanner;

public class QE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner time = new Scanner(System.in);		
		int H = time.nextInt(); //��
		int M = time.nextInt(); //��
		
		if(M<45)
		{
			H--; // '��'�� 45���� ���� �� '��'�� ���ҽ�Ų��.
			M=60-(45-M); // ��ü 60�п��� (45-M)���� ���ҽ�Ų��.
			
		if(H<0)
		{
			H =23; // '��'�� 0���� �� �� 23���� �ʱ�ȭ ��Ų��.
		}
		System.out.println(H+" "+M); // ��� ���
	}
		else {
			System.out.println(H+" "+(M-45)); // �ð� �Է°��� 23�� �ʰ��ϰų� �� �Է°��� 60�� �ʰ��� ��� 
											  // else���� �۵��Ѵ�.
	
		}
	}
	
}
