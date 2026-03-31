package gcr_codebase.strings;

import java.util.Scanner;

public class UpperCaseCompare {

    public static String conversion(String str) {
        String upperCase = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            upperCase += ch;
        }
        return upperCase;
    }

    public static boolean compare(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String manual = conversion(str);
        System.out.println("Converted String: " + manual);

        String builtIn = str.toUpperCase();

        System.out.println(compare(manual, builtIn));
    }
}
