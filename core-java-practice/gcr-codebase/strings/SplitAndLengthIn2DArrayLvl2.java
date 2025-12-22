package gcr_codebase.strings;

import java.util.Scanner;

public class SplitAndLengthIn2DArrayLvl2 {

    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitUsingCharAt(String str) {
        int len = stringLength(str);
        String[] temp = new String[len];
        String word = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    temp[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            temp[index++] = word;
        }

        String[] words = new String[index];
        for (int i = 0; i < index; i++) {
            words[i] = temp[i];
        }

        return words;
    }

    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = splitUsingCharAt(str);
        String[][] ans = wordLengthArray(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < ans.length; i++) {
            int len = Integer.parseInt(ans[i][1]);
            System.out.println(ans[i][0] + "\t" + len);
        }

    }
}
