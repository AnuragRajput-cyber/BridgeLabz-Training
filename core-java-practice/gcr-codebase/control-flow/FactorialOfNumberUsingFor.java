package gcr_codebase.control_flow;

import java.util.Scanner;

public class FactorialOfNumberUsingFor {
	static void Fact(int n) {
        if(n>=0){
            int fact=1;
            for(int i=1;i<=n;i++) {
                fact*=i;
            }
            System.out.println(fact);
        }else{
            System.out.println("Not a positive integer");
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    }
}
