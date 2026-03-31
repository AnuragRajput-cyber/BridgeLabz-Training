package gcr_codebase.java_String_Extras;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String[]words=str.split(" ");
		String res="";
		
		for (String word : words) {
            if (word.length() > res.length()) {
                res = word;
            }
        }
		System.out.println("Longest word : "+res);
	}
	
}
