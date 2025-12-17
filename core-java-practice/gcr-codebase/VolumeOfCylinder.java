package gcr_codebase;
import java.util.Scanner;
import java.math.*;

public class VolumeOfCylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("Volume: "+ Math.PI*r*r*h);
	}
}
