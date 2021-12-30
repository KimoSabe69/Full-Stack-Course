package flights;

public class Flight {
	
	private String flightNumber, airline, source, destination, departure, arrival;

	public Flight() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Flight(String flightNumber, String airline, String source, String destination, String departure, String arrival) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
	}

	public String getFlightNumber() {return flightNumber;}

	public void setFlightNumber(String flightNumber) {this.flightNumber = flightNumber;}

	public String getAirline() {return airline;}

	public void setAirline(String airline) {this.airline = airline;}

	public String getSource() {return source;}

	public void setSource(String source) {this.source = source;}

	public String getDestination() {return destination;}

	public void setDestination(String destination) {this.destination = destination;}

	public String getDeparture() {return departure;}

	public void setDeparture(String departure) {this.departure = departure;}

	public String getArrival() {return arrival;}

	public void setArrival(String arrival) {this.arrival = arrival;}
	
	
}
