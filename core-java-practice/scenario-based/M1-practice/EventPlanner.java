package m1.practice;

import java.time.LocalDate;
import java.util.*;

abstract class Festival{
	 String name;
	String location;
	int date;
	Festival(String name,String location,int date){
		this.name=name;
		this.location=location;
		this.date=date;
	}
	abstract void display();
}
class MusicFestival extends Festival{
	String headLiners;
	String musicGenre;
	double ticketPrice;
	MusicFestival(String name, String location, int date,String headLiners,String musicGenere,double ticketPrice) {
		super(name, location, date);
		this.headLiners=headLiners;
		this.musicGenre=musicGenere;
		this.ticketPrice=ticketPrice;
		// TODO Auto-generated constructor stub
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("HeadLiners: "+headLiners);
		System.out.println("Music genere: "+musicGenre);
		System.out.println("Ticket Price: "+ticketPrice);
		
	}
	
}
class FoodFestival extends Festival{
	String cuisine;
	int numStalls;
	double entryFee;
	FoodFestival(String name, String location, int date,String cuisine,int numStalls,double entryFee) {
		super(name, location, date);
		this.cuisine=cuisine;
		this.numStalls=numStalls;
		this.entryFee=entryFee;
		// TODO Auto-generated constructor stub
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Cuisine: "+cuisine);
		System.out.println("Number of stalls "+numStalls);
		System.out.println("Entry Fee: "+entryFee);
		
	}
	
}
class ArtFestival extends Festival{
	String artType;
	int numArtist;
	double exhibitionFee;
	ArtFestival(String name, String location, int date,String artType,int numArtist,double exhibitionFee) {
		super(name, location, date);
		this.artType=artType;
		this.numArtist=numArtist;
		this.exhibitionFee=exhibitionFee;
		// TODO Auto-generated constructor stub
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Art Type: "+artType);
		System.out.println("Number of Artists "+numArtist);
		System.out.println("exhibitionFee: "+exhibitionFee);
		
	}
	
}


public class EventPlanner {
	static List<Festival>festivals=new ArrayList<>();
	public static void addFestival(Festival f ) {
		festivals.add(f);
	}
	public static void display(String festivalName) {
		festivals.stream().filter(k->k.name.equalsIgnoreCase(festivalName)).forEach(Festival::display);;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String str=sc.nextLine();
			String[]inp=str.split(" ");
			String command=inp[0];
			if(command.equalsIgnoreCase("ADD_FESTIVAL")) {
				if(inp[1].equalsIgnoreCase("MUSIC")) {
					addFestival(new MusicFestival(inp[2], inp[3], Integer.parseInt(inp[4]), inp[5], inp[6], Double.parseDouble(inp[7])));
				}
				else if(inp[1].equalsIgnoreCase("ART")) {
					addFestival(new ArtFestival(inp[2], inp[3], Integer.parseInt(inp[4]), inp[5], Integer.parseInt(inp[6]), Double.parseDouble(inp[7])));
				}else {
					addFestival(new FoodFestival(inp[2], inp[3], Integer.parseInt(inp[4]), inp[5], Integer.parseInt(inp[6]), Double.parseDouble(inp[7])));
				}
			}
			if(command.equalsIgnoreCase("DISPLAY_DETAILS")) {
				display(inp[1]);
			}
			if(command.equalsIgnoreCase("EXIT")) {
				break;
			}
		}
	}
	
}
