package gcr_codebase;

import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double add=a+b;
		double sub=b-c;
		double mul=a*c;
		System.out.println("the Result Operation are "+add+", "+sub+", "+mul);
	}
	
}