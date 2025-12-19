package gcr_codebase.control_flow;

import java.util.Scanner;

public class SumOfNNatural {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			sum+=i;
		}
		System.out.println("sum of "+n+" natural number is : "+sum);
	}
}
