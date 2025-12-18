package gcr_codebase;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double base=sc.nextInt();
		double height=sc.nextInt();
		double areaInSqrCm=(1.0/2)*base*height;
		double areaInInches=areaInSqrCm/6.45;
		System.out.println("Youe area in Sqaure Centimenters is "+areaInSqrCm+" and in square inches "+areaInInches);
		
	}
}
