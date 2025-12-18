package gcr_codebase;
import java.util.Scanner;
public class FeetToYardsAndMiles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double feet=sc.nextDouble();
		double yards=feet/3;
		double miles=yards/1760;
		System.out.println("Your Distance in yards is "+yards+"yards and in miles is "+miles);
	}
}
