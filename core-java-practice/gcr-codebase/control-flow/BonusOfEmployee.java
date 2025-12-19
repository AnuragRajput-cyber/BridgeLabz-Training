package gcr_codebase.control_flow;

import java.util.Scanner;

public class BonusOfEmployee {
	static void computeBonus(double salary, int years) {
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println( bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		int yearOfService=sc.nextInt();
        computeBonus(salary, yearOfService);
        
    }
}
