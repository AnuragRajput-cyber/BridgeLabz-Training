package gcr_codebase.arrays;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int maxFactor=10;
		int[]factors=new int[maxFactor];
		int index=0;
		
		for(int i=1;i<=maxFactor;i++) {
			if(number%i==0) {
				factors[index++]=i;
			}
		}
		System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
	}
}
