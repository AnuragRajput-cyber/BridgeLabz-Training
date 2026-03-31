package gcr_codebase.built_In_function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ArithmaticDate{
    public static void main(String args[] ) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inpDate=sc.nextLine();
        DateTimeFormatter formate=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date=LocalDate.parse(inpDate,formate);
        LocalDate updatedDate=date.plusDays(7).plusMonths(1).plusYears(2);
        updatedDate=updatedDate.minusWeeks(3);
        System.out.println("Original Date: "+date);
        System.out.println("Updated Date: "+updatedDate);
    }
}
