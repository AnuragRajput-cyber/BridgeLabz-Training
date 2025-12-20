package gcr_codebase.arrays;


import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        for (int i = 6; i <= 9; i++) {
            System.out.println("Table for " + num + " up to " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(num + " * " + j + " = " + (num * j));
            }
        }
    }
}
