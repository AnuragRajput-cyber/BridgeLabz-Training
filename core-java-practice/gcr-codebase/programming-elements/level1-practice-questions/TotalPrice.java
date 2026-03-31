package gcr_codebase;

import java.util.Scanner;

public class TotalPrice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int unitPrice=sc.nextInt();
		int quantity=sc.nextInt();
		int totalPrice=unitPrice*quantity;
		System.out.println("The total price in INR is totalPrice "+totalPrice+" if the quantity "+quantity+" with unit price of "+unitPrice);
	}
}
