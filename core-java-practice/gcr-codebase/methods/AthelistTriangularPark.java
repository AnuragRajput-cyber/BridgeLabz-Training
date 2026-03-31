package gcr_codebase.methods;

import java.util.Scanner;

public class AthelistTriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double peri=a+ b +c;
        return 5000/ peri;
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        double c =sc.nextDouble();

        double rounds=calculateRounds(a,b,c);
        System.out.println("Number of round required: " +rounds);
    }
}
