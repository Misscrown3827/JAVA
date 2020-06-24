package QE0;

import java.util.Scanner;

public class QE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner time = new Scanner(System.in);		
		int H = time.nextInt(); //시
		int M = time.nextInt(); //분
		
		if(M<45)
		{
			H--; // '분'이 45보다 작을 시 '시'를 감소시킨다.
			M=60-(45-M); // 전체 60분에서 (45-M)값을 감소시킨다.
			
		if(H<0)
		{
			H =23; // '시'가 0으로 될 시 23으로 초기화 시킨다.
		}
		System.out.println(H+" "+M); // 몇시 몇분
	}
		else {
			System.out.println(H+" "+(M-45)); // 시간 입력값이 23을 초과하거나 분 입력값이 60을 초과할 경우 
											  // else문이 작동한다.
	
		}
	}
	
}
