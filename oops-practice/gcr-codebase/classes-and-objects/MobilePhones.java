package oops;

public class MobilePhones {
	String brand;
	String model;
	double price;
	
	MobilePhones(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand Name: "+brand);
		System.out.println("Model Name: "+model);
		System.out.println("Price: "+price);
		System.out.println("--------------------------");
	}
	public static void main(String[] args) {
		MobilePhones mb1=new MobilePhones("Samsung", "S22 Ultra", 120000);
		MobilePhones mb2=new MobilePhones("OnePlus", "Nord 5", 32000);
		MobilePhones mb3=new MobilePhones("vivo", "v15", 20000);

		System.out.println("------Mobile Details------");
		mb1.display();
		mb2.display();
		mb3.display();
	}
}
