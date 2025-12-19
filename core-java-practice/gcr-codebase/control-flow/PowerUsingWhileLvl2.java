package gcr_codebase.control_flow;

import java.util.Scanner;

public class PowerUsingWhileLvl2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

        int number = sc.nextInt();

        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result: " + result);
    }
}
