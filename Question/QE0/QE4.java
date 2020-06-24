package QE0;

import java.util.Scanner;

public class QE4 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		
		if(a>0 && b>0) 
		{
			System.out.println("1");
		}
			
		else if(a<0 && b>0)
		{
			System.out.println("2");
		}
		
		else if(a<0 && b<0)
		{
			System.out.println("3");
		}
		
		else if(a>0 && b<0)
		{
			System.out.println("4");
		}
			
	}

}
