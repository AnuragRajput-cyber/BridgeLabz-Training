package gcr_codebase.control_flow;

import java.util.Scanner;

public class ArmstrongNumberLvl3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int org = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == org) {
            System.out.println(org + " is an Armstrong Number");
        } else {
            System.out.println(org + " is Not an Armstrong Number");
        }
    }

}
