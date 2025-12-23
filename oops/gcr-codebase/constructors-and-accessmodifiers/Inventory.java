package oops.constructors_and_accessmodifiers;

public class Inventory{
	private String productName;
	private int price;

	
	private static int totalProducts=0;
	
	public Inventory(String productName,int price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}

	public void displayProductDetails(){
		System.out.println("Product Details:-");
		System.out.println("Product name: "+this.productName);
		System.out.println("Product price: "+this.price);
	}

	public static void displayTotalProducts(){
		System.out.println("\nTotal Products:-");
		System.out.println("Total product "+totalProducts);
	}

	public static void main(String args[]){
		Inventory product1=new Inventory("Laptop",55000);
		Inventory product2=new Inventory("Mobile",27000);

		product1.displayProductDetails();
		product2.displayProductDetails();

		Inventory.displayTotalProducts();
	}
}