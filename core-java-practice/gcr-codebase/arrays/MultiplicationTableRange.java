package gcr_codebase.arrays;


import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
	int[]multiplicationRes=new int[4];
	
        for(int i=6;i<=9;i++){
	    multiplicationRes[i-6]=num*i;
	}
	for(int i=6;i<=9;i++){
	    System.out.println(num+" * "+i+" = " +multiplicationRes[i-6]);
	}
    }
}
