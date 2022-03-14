package sample;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public abstract class Ticket {


    private String pnr;
    private String departure;
    private String destination;
    private Flight flight;
    private String dateTimeDep;
    private String dateTimeArr;
    private Passenger passenger;
    public String seatNo;
    private float ticketPrice;
    private boolean cancelled;


    Ticket(String pnr, String dep, String des, Flight flight, String dateTimeDep, String dateTimeArr, Passenger passenger, String seatNo, float ticketPrice, boolean cancel){
        this.pnr = pnr;
        this.departure = dep;
        this.destination = des;
        this.flight = flight;
        this.dateTimeDep = dateTimeDep;
        this.dateTimeArr = dateTimeArr;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.cancelled = cancel;

    }

    public String getTicketStatus(){
        System.out.println("Ticket Details:");
        System.out.println("PNR: " + pnr);
        return passenger.getContact() + passenger.getAddress();
    }

    public int getFlightDuration() throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(dateTimeDep);
        Date d2 = sdf.parse(dateTimeArr);
        long difference_In_Time
                = d2.getTime() - d1.getTime();
        long difference_In_Minutes
                = (difference_In_Time
                / (1000 * 60))
                % 60;
        return (int)difference_In_Minutes;
    }

    abstract String getPnr();

    public String getDeparture(){
        return this.departure;
    }
    public String getDestination(){
        return this.destination;
    }
    public String getPassengerDetails(){
        return passenger.getContact() + "\n" + passenger.getAddress();
    }
    public void cancelTicket(){
        this.cancelled = true;
    }

    public void setPnr(String pnr) {this.pnr = pnr;}

}
