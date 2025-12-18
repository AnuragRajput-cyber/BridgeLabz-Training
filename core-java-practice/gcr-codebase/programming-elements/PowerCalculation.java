package gcr_codebase;
import java.util.Scanner;
public class PowerCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double base=sc.nextDouble();
		double exponent=sc.nextDouble();
		System.out.println("answer: "+ Math.pow(base, exponent));
	}
}
