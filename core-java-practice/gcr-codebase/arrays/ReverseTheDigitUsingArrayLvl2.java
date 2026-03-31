package gcr_codebase.arrays;

import java.util.Scanner;

public class ReverseTheDigitUsingArrayLvl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        System.out.println("Reversed number:");
        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}

