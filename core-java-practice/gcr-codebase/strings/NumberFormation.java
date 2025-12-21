package gcr_codebase.strings;

import java.util.Scanner;

public class NumberFormation {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println( "Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred while generating");
        }

        handleException(text);
    }
}
