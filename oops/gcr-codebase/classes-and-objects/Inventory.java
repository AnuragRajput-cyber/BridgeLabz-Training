package oops;

public class Inventory{
	String[] itemCode;
	String[] itemName;
	double[] price;
	Inventory(String[] itemName,String[] itemCode,double[] price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	public void displayItem(int i){
		System.out.println("Code: "+itemCode[i]);
		System.out.println("Name: "+itemName[i]);
		System.out.println("Price: "+price[i]);
		System.out.println("------------------");
	}
	public static void main(String[] args){
		String[] names={"Burger","pudding","Bread"};
		String[] codes={"011","012","013"};
		double[] prices={500,700,400};
		Inventory items=new Inventory(names,codes,prices);
		for(int i=0;i<prices.length;i++){
			items.displayItem(i);
		}
	}
}

