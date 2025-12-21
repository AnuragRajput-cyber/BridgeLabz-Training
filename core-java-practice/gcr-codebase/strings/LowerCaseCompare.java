package gcr_codebase.strings;

import java.util.Scanner;

public class LowerCaseCompare {

    public static String conversion(String str) {
        String lowerCase = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            lowerCase += ch;
        }
        return lowerCase;
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

        String builtIn = str.toLowerCase();

        System.out.println(compare(manual, builtIn));
    }
}
