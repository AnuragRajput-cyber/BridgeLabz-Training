package gcr_codebase.control_flow;

import java.util.Scanner;

public class SmallestOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		boolean ans=false;
		if(number1<number2 && number1<number3) {
	
			ans=true;
		}
		System.out.println("is the first number smallest of three?: "+ans);
	}
}
