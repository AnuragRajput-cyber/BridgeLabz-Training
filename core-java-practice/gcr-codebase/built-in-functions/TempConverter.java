package gcr_codebase.built_In_function;
import java.util.Scanner;

public class TempConverter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Temperature Converter=>");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("3. Exit");
            
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Temperature in Fahrenheit: ");
                    double fah=sc.nextDouble();
                    System.out.println("Temperature in Celsius is "+((fah-32)*5/9));
                    break;

                case 2:
                    System.out.print("Enter Temperature in Celcius: ");
                    double cel=sc.nextDouble();
                    System.out.println("Temperature in Fahrenheit is "+((cel*9/5)+32));
                    break;

                case 3:
                    System.out.println("Exiting Temperature Converter...");
                    break;
                    
                    
                default:
                    System.out.println("Invalid choice!!");
            }
        }while(choice!=3);
    }
}

