package gcr_codebase.strings;

public class NullPointerExceptionHandling {
	public static void generatingException() {
		String text=null;
		System.out.println(text.length());
	}
	public static void handlingException() {
		String text=null;
		try {
			System.out.println(text.length());
		}catch (NullPointerException e) {
			System.out.println("Handled");
		}
	}
	public static void main(String[] args) {
		
		try {
			generatingException();
		}catch(NullPointerException e) {
			System.out.println("Exception Occures is method");
		}
		handlingException();
	}
}
