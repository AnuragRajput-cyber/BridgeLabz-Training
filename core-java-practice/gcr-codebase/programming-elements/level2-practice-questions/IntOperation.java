package gcr_codebase;

import java.util.Scanner;

public class IntOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int add=a+b;
		int sub=b-c;
		int mul=a*c;
		System.out.println("the Result Operation are "+add+", "+sub+", "+mul);
	}
	
}
