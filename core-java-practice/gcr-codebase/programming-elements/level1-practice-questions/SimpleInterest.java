package gcr_codebase;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principleMoney=sc.nextInt();
		int rate=sc.nextInt();
		int timeInYear=sc.nextInt();
		System.out.println("SI: " + (principleMoney*rate*timeInYear)/100);
	}
}
