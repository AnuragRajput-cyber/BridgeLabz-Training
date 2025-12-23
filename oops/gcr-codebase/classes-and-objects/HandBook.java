package oops;

public class HandBook{
	String title;
	String author;
	double price;
	HandBook(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayBookDetails(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args){
		HandBook b1=new HandBook("2 States","Chetan Bhagat",500);
		HandBook b2=new HandBook("Wings Of Fire","A.P.J Abdul Kalam",500);
		b1.displayBookDetails();
		b2.displayBookDetails();
	}
}

