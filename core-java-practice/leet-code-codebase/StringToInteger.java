package leet_code_codebase;
import java.util.Scanner;
public class StringToInteger {
	public static int convert(String s) {
		int INT_MAX = Integer.MAX_VALUE;  
        int INT_MIN = Integer.MIN_VALUE;  
        int i = 0;  
        while (i < s.length() && s.charAt(i) == ' ') {  
            i++;  
        }  
        int sign = 1;  
        if (i < s.length()) {  
            char c = s.charAt(i);  
            if (c == '-') {  
                sign = -1;  
                i++;  
            } else if (c == '+') {  
                i++;  
            }  
        }   
        long num = 0; 
        while (i < s.length() && Character.isDigit(s.charAt(i))) {  
            num = num * 10 + (s.charAt(i) - '0');  
            i++;   
            if (num * sign > INT_MAX) {  
                return INT_MAX;  
            }  
            if (num * sign < INT_MIN) {  
                return INT_MIN;  
            }  
        }  
        
        return (int) (num * sign);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ans=convert(s);
		System.out.println(ans);
	}
}
