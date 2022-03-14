package sample;

public class Passenger {

    private static int idCounter;
    private int id;
    public Address address;
    public Contact contact;

    static{
        idCounter=0;
    }

    private static class Address {

        public String street;
        public String city;
        public String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getAddressDetails(){
            return "Street: " + street + " City: " + city + " State: " + state;
        }
        public void updateAddressDetails(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }


    }

    private static class Contact {
        public String name;
        public String phone;
        public String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getContactDetails(){return "Contact Name: " + name + " Contact PhoneNo: " + phone + "Contact Email: " + email;}
        public void updateContactDetails(String name, String phone, String email){
                this.name = name;
                this.phone =phone;
                this.email = email;
        }
    }


    public Passenger(String addressStreet, String addressCity,
                           String addressState, String contactName, String contactPhone,
                           String contactEmail) {
        this.id = ++idCounter + 100;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getPassengerCount(){
        return idCounter;
    }

    public int getId() {
        return this.id;
    }
    public String getContact(){
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
    public String getAddress(){
        return address.street + ", " + address.city + ", " + address.state;
    }
}
