package gcr_codebase.control_flow;

import java.util.Scanner;

public class FactorialOfIntegerUsingWhile {
	static void factorial(int n) {
        if(n>=0) {
            int fact=1;
            int i=1;
            while(i<=n) {
            	fact*=i;
            	i++;
            }
            System.out.println(fact);
        }else{
            System.out.println("Not a positive integer");
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	factorial(num);
    }
}
