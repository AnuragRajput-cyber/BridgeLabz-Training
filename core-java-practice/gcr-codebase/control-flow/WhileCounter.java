package gcr_codebase.control_flow;

import java.util.Scanner;

public class WhileCounter {
	static void  CountWhile(int counter) {
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
        CountWhile(num);
    }
}
