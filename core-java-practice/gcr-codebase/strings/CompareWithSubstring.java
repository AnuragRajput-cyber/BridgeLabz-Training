package gcr_codebase.strings;

import java.util.Scanner;

public class CompareWithSubstring {
	public static String createString(String str,int startIdx,int endIdx) {
		String str2="";
		for(int i=startIdx;i<=endIdx;i++) {
			 str2+=str.charAt(i);
		}
		return str2;
	}
	public static boolean compare(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1=sc.next();
		System.out.println("Starting Index: ");
		int startIdx=sc.nextInt();
		System.out.println("Ending Index: ");
		int endIdx=sc.nextInt();
		
		String str2=createString(str1, startIdx, endIdx);
		System.out.println("Created String: "+str2);
		System.out.println(compare(str1, str2));
	}

}
