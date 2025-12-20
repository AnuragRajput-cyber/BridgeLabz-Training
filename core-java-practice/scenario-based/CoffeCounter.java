package scenario_based;

import java.util.Scanner;

public class CoffeCounter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalAmount=0;
		while(true) {
			System.out.println("Your Current amount(Tax excluded): "+totalAmount); 
			
			System.out.println("ENTER THE COFFE TYPE AS NUMBER: :\n 1.Cold Cofee :100\n 2.Black Coffe :200\n 3.Cappaccino :300\n 4.Mocha :250 \n 5.exit");
			
			int coffeType=sc.nextInt();
			
			if(coffeType==5)break;
			
			System.out.println("Quantity: ");
			int quantity=sc.nextInt();
			
			switch(coffeType) {
	
			case 1:
				totalAmount+=100*quantity;
				break;
				
			case 2:
				totalAmount+=200*quantity;
				break;
			case 3:
				totalAmount+=300*quantity;
				break;
			default:
				System.out.println("You typed something else!");
			}
			
		}
		double gst=totalAmount*0.08;
		System.out.println("Your total amount (with tax included): "+(totalAmount+"+"+ gst));
	}
}
