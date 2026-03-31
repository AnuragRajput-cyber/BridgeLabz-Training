package gcr_codebase;
import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tempInCels=sc.nextInt();
		System.out.print((tempInCels*(9/5))+32);
	}
}
