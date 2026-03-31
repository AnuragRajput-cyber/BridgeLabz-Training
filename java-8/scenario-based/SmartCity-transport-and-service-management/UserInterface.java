package java8.scenario_based.smartcity_transport_and_service_management;
import java.util.*;
import java.util.stream.Collectors;
public class UserInterface {
	public static void main(String[] args) {
		List<TransportService> services=Arrays.asList(
                new BusService("Mathura-Chamuhan", 30, 9),
                new MetroService("Mathura-Hathras", 25, 8),
                new TaxiService("Mathura-Chamuhan", 60, 7)
        );
		
		FareCalculator fareCalculator=d->d*5;
		double distance=GeoUtils.calculateDistance(0, 0, 3, 4);
		System.out.println("Caluculated fare: "+fareCalculator.calculateFare(distance));
		
		System.out.println("-------------------Sorted By fare---------");
		services.stream().sorted(Comparator.comparingInt(TransportService::getDepartureTime).thenComparingDouble(TransportService::getFare)).forEach(TransportService::printServiceDetails);
	
		
		System.out.println("<-----------Live DashBoard----->");
		services.forEach(s->System.out.println("Live : "+s.getName()));
		List<Passenger> trips = Arrays.asList(
				new Passenger("Mathura-Delhi",30,true),
				new Passenger("Mathura-Delhi",60,false),
				new Passenger("Mathra-Chhata",25,true),
				new Passenger("Mathura-Chhata",25,false)
				);
		System.out.println("------------Grouping By route-------");
		Map<String,List<Passenger>>byRoute=trips.stream().collect(Collectors.groupingBy(s->s.getRoute()));
		byRoute.forEach((k,v)->{
			System.out.println(k+" route:"+v.size());
		});
		
		System.out.println("----------------Partitioning By Peak----------------");
		Map<Boolean,List<Passenger>>peakSplit=trips.stream().collect(Collectors.partitioningBy(Passenger::isPeak));
		
		System.out.println("Peak: "+peakSplit.get(true).size());	
		System.out.println("Non-Peak: "+peakSplit.get(false).size());	
		DoubleSummaryStatistics stats=trips.stream().collect(Collectors.summarizingDouble(Passenger::getFare));
        System.out.println("Total Revenue: "+stats.getSum());
        System.out.println("Average Fare: "+stats.getAverage());
	}
}
