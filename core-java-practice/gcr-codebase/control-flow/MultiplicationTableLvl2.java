package gcr_codebase.control_flow;

import java.util.Scanner;

public class MultiplicationTableLvl2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        for (int i=6;i<=9;i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
