package gcr_codebase;
import java.util.Scanner;
public class CmToFeetsInches {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double height=sc.nextInt();
		double inches=height/2.54;
		double feet=inches/12;
		System.out.println("Your height in CM is "+height+" while in Feet is "+feet+" and in Inches is "+inches+".");
		
		
				
	}
}
