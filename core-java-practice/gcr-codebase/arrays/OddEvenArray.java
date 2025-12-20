package gcr_codebase.arrays;


import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Error: Enter a positive number.");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIdx = 0, evenIdx = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIdx++] = i;
            } else {
                odd[oddIdx++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}

