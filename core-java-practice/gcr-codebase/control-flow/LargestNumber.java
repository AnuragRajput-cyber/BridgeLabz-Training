package gcr_codebase.control_flow;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("if the number 1 is largest: "+((num1>num2)&&(num1>num3)));
		System.out.println("if the number 2 is largest: "+((num2>num1)&&(num2>num3)));
		System.out.println("if the number 3 is largest: "+((num3>num1)&&(num3>num2)));
	}
}
