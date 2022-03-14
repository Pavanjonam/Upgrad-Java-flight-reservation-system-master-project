package sample;

public class RegularTicket extends Ticket{
    private String specialServices;
    public String pnr;

    RegularTicket(String pnr, String dep, String des, Flight flight, String dateTimeDep, String dateTimeArr, Passenger passenger, String seatNo, float ticketPrice, boolean cancel,String specialServices){
        super(pnr, dep, des, flight, dateTimeDep, dateTimeArr, passenger, seatNo, ticketPrice, cancel);
        this.specialServices =  specialServices;
        this.pnr = pnr;
    }

    public String getServices(){
        return specialServices;
    }
    public void updateServices(String services){
        this.specialServices = services;
    }

    public String getPnr(){
        return pnr;
    }

}
