package gcr_codebase.strings;

import java.util.Scanner;

public class CharArrayMethod {
	public static char[] characterArray(String str) {
		char[]characters=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			characters[i]=str.charAt(i);
		}
		return characters;
	}
	public static boolean compareArrays(char[] str1, char[] str2) {

        if (str1.length != str2.length) {
            return false;
        }

        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[]str2=characterArray(str);
		compareArrays(str.toCharArray(), str2);
		System.out.println(compareArrays(str.toCharArray(), str2));
		
	}
}
