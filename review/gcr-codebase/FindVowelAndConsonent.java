package reviews;

import java.util.Scanner;

public class FindVowelAndConsonent {
	public void countVowelAndConsonent(String str) {
		int vowel=0;
		int cosonent=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
				
			}else if(ch==' ') {
				continue;
			}else {
				cosonent++;
			}
		}
		System.out.println("Given String :"+str);
		System.out.println("Vowels :"+vowel);
		System.out.println("Consonent :"+cosonent);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		FindVowelAndConsonent fvc=new FindVowelAndConsonent();
		fvc.countVowelAndConsonent(str);
	}
}
