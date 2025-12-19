package gcr_codebase.control_flow;

import java.util.Scanner;

public class HarshadNumberLvl3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int org = num;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (org % sum == 0) {
            System.out.println(org + " is a Harshad Number");
        } else {
            System.out.println(org + " is Not a Harshad Number");
        }
    }

}
