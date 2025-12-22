package gcr_codebase.strings;

import java.util.Scanner;

import java.util.Scanner;

public class BodyMassIndexLvl3 {

    public static String[][] calculateBMI(double[][] data) {
        String[][] res = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double calculatedBmi = weight / (height * height);
            String status = "";

            if (calculatedBmi < 18.5) status = "Underweight";
            else if (calculatedBmi < 25) status = "Normal";
            else if (calculatedBmi < 30) status = "Overweight";
            else status = "Obese";

            res[i][0] = String.format("%.2f", data[i][0]) + " kg";
            res[i][1] = String.format("%.2f", data[i][1]) + " cm";
            res[i][2] = String.format("%.2f", calculatedBmi);
            res[i][3] = status;
        }
        return res;
    }

    public static void displayTable(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : result) {
            for (String value : row) {
                System.out.printf("%-10s ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] res = calculateBMI(data);
        displayTable(res);
    }
}
