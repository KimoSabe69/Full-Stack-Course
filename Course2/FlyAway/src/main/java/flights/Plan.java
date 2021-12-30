package flights;

public class Plan {
	private String source, destination, departure, arrival, passengers;

	public Plan() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Plan(String source, String destination, String departure, String arrival, String passengers) {
		super();
		this.source = source ;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
		this.passengers = passengers;
	}

	public String getSource() {return source;}

	public void setSource(String source) {this.source = source;}

	public String getDestination() {return destination;}

	public void setDestination(String destination) {this.destination = destination;}

	public String getDeparture() {return departure;}

	public void setDeparture(String departure) {this.departure = departure;}

	public String getArrival() {return arrival;}

	public void setArrival(String arrival) {this.arrival = arrival;}

	public String getPassengers() {return passengers;}

	public void setPassengers(String passengers) {this.passengers = passengers;}

}
