package gcr_codebase.strings;

import java.util.Scanner;

public class LengthOfStringLvl2 {
	public static int stringLength(String str) {
		int length=0;
		int i=0;
		while(true) {
			try {
				str.charAt(i);
				length++;
				
			}catch(RuntimeException e) {
				System.out.println("RunTimeException: Loop exceed to the limit");
				break;
			}
			i++;
		}
		return length;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=(stringLength(str));
		System.out.println("User Defined method: "+length);
		System.out.println("BuiltIn Method: "+str.length());
		
	}
}
