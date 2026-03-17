package m1.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorporateEmailAccessControl {
	public static void validateEmail(String str) {
		String regex="^[a-z]{3,}\\.[a-z]{3,}\\d{4,}\\@(sales|marketing|IT|product)\\.company\\.com$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches()) {
			System.out.println("Access Granted");
		}else {
			System.out.println("Access Denied");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String str=sc.nextLine();
			validateEmail(str);
		}
	}
}
