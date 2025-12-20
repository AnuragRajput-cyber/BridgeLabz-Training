package gcr_codebase.arrays;

import java.util.Scanner;

public class LargestAndSecondLargestLvl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int idx = 0;

        while (num != 0 && idx < 10) {
            digits[idx++] = num % 10;
            num /= 10;
        }

        int max = -1, secondMax = -1;

        for (int i = 0; i < idx; i++) {
            if (digits[i] > max) {
                secondMax = max;
                max = digits[i];
            } else if (digits[i] > secondMax && digits[i] != max) {
                secondMax = digits[i];
            }
        }

        System.out.println("Largest digit: " + max);
        System.out.println("Second largest digit: " + secondMax);
    }
}

