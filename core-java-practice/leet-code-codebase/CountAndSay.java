package leet_code_codebase;

import java.util.Scanner;

public class CountAndSay {
	public static String CountNSay(int n) {
		String curr = "1";
        while (--n > 0) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < curr.length();) {
                int end = i;
                while (end < curr.length() && curr.charAt(end) == curr.charAt(i)) {
                    end++;
                }
                int count = end - i;
                ans.append(count);
                ans.append(curr.charAt(i));

                i = end;

            }
            curr = ans.toString();

        }
        return curr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result=CountNSay(n);
		System.out.println(result);
	}
}
