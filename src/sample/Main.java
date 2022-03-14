package sample;

public class Main {

    public static void  printTicketDetails(Ticket ticket){
           System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {
        String[] touristLocation = new String[]{"Bat", "Ball", "Iron Piller"};
        Flight flight = new Flight("12345", "JetAirways", 40);
        Passenger passenger = new Passenger("Akkayapalem", "Visakhapatnam", "Andhra Pradesh", "Pavan", "8328282417", "pavanmanoj16@gmail.com");

        RegularTicket ticket1 = new RegularTicket("112233", "VSKP", "MUM", flight, "20/03/2022 20:00", "20/03/2022 23:00", passenger, "2", 2000, false, "Food, Drinks");
        TouristTicket ticket2 = new TouristTicket("122132", "MUM", "VSKP", flight, "20/03/2022 16:00", "20/03/2022 19:00", passenger, "3", 2500, false, "8685,C-8,Vasant Kunj", touristLocation);

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);


    }
}
