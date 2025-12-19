package gcr_codebase.control_flow;

import java.util.Scanner;

public class MultiplicationTable {
	static void printTable(int number) {
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
        printTable(num);
    }
}
