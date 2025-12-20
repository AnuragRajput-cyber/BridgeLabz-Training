package gcr_codebase.arrays;


import java.util.Scanner;

public class FizzBuzzUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Enter a positive number.");
            return;
        }

        String[] res = new String[number];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                res[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                res[i - 1] = "Buzz";
            } else {
                res[i - 1] = String.valueOf(i);
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + res[i]);
        }
    }
}

