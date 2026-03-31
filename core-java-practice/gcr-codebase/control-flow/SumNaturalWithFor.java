package gcr_codebase.control_flow;

import java.util.Scanner;

public class SumNaturalWithFor {
	static void compareSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		int byFormula=(n*(n+1))/2;
		if(sum==byFormula) {
			System.out.println("Both are same");
			System.out.println("sum by for loop: "+sum);
			System.out.println("sum by formula: "+byFormula);
		}else {
			System.out.println("Not same");
		}
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	if(num>=1) {
    		System.out.println("Natural Number");
    		compareSum(10);
    	}else {
    		System.out.println("Not natural");
    	}
    }
}
