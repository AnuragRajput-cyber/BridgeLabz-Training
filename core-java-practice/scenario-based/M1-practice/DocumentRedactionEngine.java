package scenario_based;

import java.util.Scanner;
import java.util.regex.*;

public class DocumentRedactionEngine {
	public static void processDocument(String str) {
		String res="";
		//id
		String nationalIdRegex="ID:[A-Z]{3}\\d{6}";
		String nationalIdReplaceRegex="ID:XXX******";
		Pattern idpattern=Pattern.compile(nationalIdRegex);
		Matcher idmatcher=idpattern.matcher(str);
		res=idmatcher.replaceAll(nationalIdReplaceRegex);
		
		//accountNumber
		String accountNoRegex="ACCT-(\\d{4})-(\\d{4})-(\\d{4})";
		String accountReplaceRegex="ACCT---$3";
		Pattern accPattern = Pattern.compile(accountNoRegex);
        Matcher accMatcher = accPattern.matcher(res);

        res= accMatcher.replaceAll(accountReplaceRegex);
		
        //NormalizeRepeated Words
        
        String normalizeRegex="\\b(\\w+)(\\s+\\1\\b)+";
        String normalizeReplaceRegex="$1";
        Pattern normalizePattern=Pattern.compile(normalizeRegex,Pattern.CASE_INSENSITIVE);
        Matcher normalizeMatcher=normalizePattern.matcher(res);
        res=normalizeMatcher.replaceAll(normalizeReplaceRegex);
        
        //RepeatedMarks
        String repeatRegex="([\\?!.])\\1{2,}$";
        String replaceRegex="$1";
        Pattern repeatedPattern=Pattern.compile(repeatRegex);
        Matcher matcher =repeatedPattern.matcher(res);
        
        res=matcher.replaceAll(replaceRegex);
        
		System.out.println(res);
	}
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        sc.nextLine();

	        while (n-- > 0) {
	            String str = sc.nextLine();   // important fix
	            processDocument(str);
	        }
	    }
}
