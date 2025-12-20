package gcr_codebase.arrays;


import java.util.Scanner;

public class TotalSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int idx = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0 || idx >= 10) {
                break;
            }
            numbers[idx++] = num;
        }

        for (int i = 0; i < idx; i++) {
            total += numbers[i];
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Total sum: " + total);
    }
}

