package gcr_codebase.java_String_Extras;

import java.util.Scanner;

public class CountVowelAndConsonent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int v=0,c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				v++;
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
				c++;
			}
		}
		System.out.println("Vowels : "+v);
		System.out.println("Consonents : "+c);
	}
}
