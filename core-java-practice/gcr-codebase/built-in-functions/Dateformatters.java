package gcr_codebase.built_In_function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dateformatters{
    public static void main(String args[]) {
        LocalDate currDate=LocalDate.now();
        DateTimeFormatter formate1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formate2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formate3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formatdDate1=currDate.format(formate1);
        String formatdDate2=currDate.format(formate2);
        String formatdDate3=currDate.format(formate3);
        System.out.println("Date in dd/MM/yyyy format: "+formatdDate1);
        System.out.println("Date in yyyy-MM-dd format: "+formatdDate2);
        System.out.println("Date in EEE, MMM dd, yyyy format: "+formatdDate3);
    }
}
