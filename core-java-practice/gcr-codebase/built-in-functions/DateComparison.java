package gcr_codebase.built_In_function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formate=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String fstDateInp=sc.nextLine();
        
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secndDateInp=sc.nextLine();
        LocalDate fstDate=LocalDate.parse(fstDateInp,formate);
        LocalDate scndDate=LocalDate.parse(secndDateInp,formate);
        if (fstDate.isBefore(scndDate)) {
            System.out.println("The first date is before the second date.");
        } else if (fstDate.isAfter(scndDate)) {
            System.out.println("The first date is after the second date.");
        } else if (fstDate.isEqual(scndDate)) {
            System.out.println("The first date is the same as the second date.");
        }
        
    }
}
