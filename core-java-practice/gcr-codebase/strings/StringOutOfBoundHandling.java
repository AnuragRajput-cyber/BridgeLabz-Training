package gcr_codebase.strings;

import java.util.Scanner;

public class StringOutOfBoundHandling {
    public static void generatingException(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    public static void handlingException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handlingException(text);
    }
}

