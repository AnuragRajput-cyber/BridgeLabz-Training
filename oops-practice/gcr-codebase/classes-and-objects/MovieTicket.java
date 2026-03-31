package oops;

public class MovieTicket{
	private String movieName;
	private String seat;
	private double price;
	private boolean booked;
	MovieTicket(String movieName){
		this.movieName=movieName;
	}
	public void bookTicket(String seat,double price){
		if(!booked){
			this.seat=seat;
			this.price=price;
			booked=true;
		}else{
			System.out.println("Ticket already booked");
		}
	}
	public void displayTicket(){
		if(booked)
			System.out.println(movieName+" Seat: "+seat+" Price: "+price);
		else
			System.out.println("No ticket booked");
	}
	public static void main(String[] args){
		MovieTicket t=new MovieTicket("Dragon");
		t.bookTicket("A10",120);
		t.displayTicket();
	}
}

