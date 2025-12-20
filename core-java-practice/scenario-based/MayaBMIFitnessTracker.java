package scenario_based;

import java.util.Scanner;

public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        System.out.println("Welcome to Maya's BMI Fitness Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.print("Height (in meters): ");
        float height = sc.nextFloat();

        System.out.print("Weight (in kg): ");
        float weight = sc.nextFloat();

        float calculatedBMI = weight / (height * height);

        System.out.println("BMI = " + calculatedBMI);

        if (calculatedBMI < 18.5f) {
            System.out.println("Category: Underweight");
        } 
        else if (calculatedBMI >= 18.5f && calculatedBMI <= 24.9f) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}
