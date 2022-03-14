package sample;

public class Flight {

    private String flightNo;
    private String airline;
    private int capacity;
    private static int seatsBooked=0;

    Flight(String flightNo, String airline, int capacity){
        this.flightNo = flightNo;
        this.airline = airline;
        this.capacity= capacity;
    }
    public String getFlightDetails(){
        return "Flight Number: " + flightNo + " Airline: " + airline + " Capacity: " + capacity + " Seats Available: " + this.checkAvailability();
    }

    public boolean checkAvailability(){
        if(seatsBooked<capacity){
            return true;
        }
        else {
            return false;
        }
    }
    public void bookedCounter(){
        seatsBooked++;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getAirline(){
        return airline;
    }
    public int getCapacity(){
        return capacity;
    }
}
