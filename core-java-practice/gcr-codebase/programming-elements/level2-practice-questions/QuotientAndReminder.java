package gcr_codebase;

import java.util.Scanner;

public class QuotientAndReminder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The Quotient is "+num1/num2+" and reminder is "+num1%num2+" of Numbers "+num1+" and "+num2);
	}
}
