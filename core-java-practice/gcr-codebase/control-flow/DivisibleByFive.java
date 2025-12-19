package gcr_codebase.control_flow;

import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean ans=false;
		if(number%5==0) {
			ans=true;
		}
		System.out.println("is the number divible by 5?: "+ans);
	}
}
