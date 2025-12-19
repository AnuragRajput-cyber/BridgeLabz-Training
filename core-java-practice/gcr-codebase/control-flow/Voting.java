package gcr_codebase.control_flow;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("The person with age "+age+" Cannot Vote.");
		}else {
			System.out.println("Yes can vote ");
		}
	}
}
