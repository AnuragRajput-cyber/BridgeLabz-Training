package m1.practice;

import java.util.Scanner;
import java.util.regex.*;

public class DynamicTemplateProcessor {
	public static void processTemplate(String str) {
		String dateRegex="\\$\\{DATE:(\\d{2})-(\\d{2})-(\\d{4})\\}";
		Pattern datePattern=Pattern.compile(dateRegex);
		Matcher dateMatcher=datePattern.matcher(str);
		if(dateMatcher.find()) {
			str=str.replaceAll(dateRegex, "$3/$2/$1");
		}
		String upperRegex="\\$\\{UPPER:([a-z]+)\\}";
		Pattern upperPattern =Pattern.compile(upperRegex);
		Matcher upperMatcher=upperPattern.matcher(str);
		if(upperMatcher.find()) {
			String replace=upperMatcher.group(1).toUpperCase();
			str=str.replaceAll(upperRegex,replace);
		}
		
		String lowerRegex="\\$\\{LOWER:([A-Z]+)\\}";
		Pattern lowerPattern =Pattern.compile(lowerRegex);
		Matcher lowerMatcher=lowerPattern.matcher(str);
		if(lowerMatcher.find()) {
			String replace=lowerMatcher.group(1).toLowerCase();
			str=str.replaceAll(lowerRegex,replace);
		}
		
		String repeatRegex="\\$\\{REPEAT:([a-zA-Z]+),(\\d+)\\}";
		Pattern repeatPattern =Pattern.compile(repeatRegex);
		Matcher repeatMatcher=repeatPattern.matcher(str);
		if(repeatMatcher.find()) {
			String word=repeatMatcher.group(1);
			int count=Integer.parseInt(repeatMatcher.group(2));
			String repeated=word.repeat(count);
			str=str.replaceAll(repeatRegex,repeated);
		}
		
		System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String str=sc.nextLine();
			processTemplate(str);
		}
	}
}
