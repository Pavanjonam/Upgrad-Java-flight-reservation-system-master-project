package sample;

public class TouristTicket extends Ticket{

    public String hotelAddress;
    public String[] touristLocations = new String[5];
    public String pnr;

    TouristTicket(String pnr, String dep, String des, Flight flight, String dateTimeDep, String dateTimeArr, Passenger passenger, String seatNo, float ticketPrice, boolean cancel, String hotelAddress, String[] touristLocations){
        super(pnr, dep, des, flight, dateTimeDep, dateTimeArr, passenger, seatNo, ticketPrice, cancel);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
        this.pnr = pnr;
    }
    public String getPnr(){
        return pnr;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocations(){
        return  touristLocations;
    }

    public void addTouristLocations(String location){

        for(String s: touristLocations){
            if (touristLocations.length == 5){
                break;
            }
            if(s=="") {
                s = location;
                break;
            }
        }
    }

    public void removeTouristLocation(String location){
        for(String s: touristLocations){
            if(s==location) {
                s = "";
                break;
            }
        }
    }
}
