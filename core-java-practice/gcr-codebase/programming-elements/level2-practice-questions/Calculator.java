package gcr_codebase;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int variable1=sc.nextInt();
		int variable2=sc.nextInt();
		int add=variable1+variable2;
		int sub=variable1-variable2;
		int multi=variable1*variable2;
		int div=variable1/variable2;
		System.out.print("The addition,substraction,multiplication and division of "+variable1+" and "+variable2+" is "+add+","+sub+","+multi+",and "+div);
		
	}
}
