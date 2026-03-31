package gcr_codebase.control_flow;

import java.util.Scanner;

public class ForCounter {
	static void  CountFor(int num) {
		for (int i=num;i>=1;i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
        CountFor(num);
    }
}
