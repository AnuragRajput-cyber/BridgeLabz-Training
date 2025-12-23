package oops;

public class PalindromeChecking{
	String text;
	PalindromeChecking(String text){
		this.text=text;
	}
	public boolean isPalindrome(){
		String str=text.replaceAll("\\s","").toLowerCase();
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	public void displayResult(){
		System.out.println(text+(isPalindrome()?" is Palindrome":" is Not Palindrome"));
	}
	public static void main(String[] args){
		PalindromeChecking pl1=new PalindromeChecking("Hello ");
		PalindromeChecking pl2=new PalindromeChecking("Gla University ");
		
		pl1.displayResult();
		pl2.displayResult();
	}
}
