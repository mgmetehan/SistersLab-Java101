package src.ders.ders9and10.akis002;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        AirlineReservationSystem airlineReservationSystem = new AirlineReservationSystem();

        Customer customer1 = new Customer("Duygu", "Ozdugan", "053155555", "do@gmail.com");
        Customer customer2 = new Customer("Hasan", "Gurel", "054566666", "hg@gmail.com");

        Flight flight1 = new Flight("R001", "A", "B", new Date(), 200);
        Flight flight2 = new Flight("R002", "B", "a", new Date(), 220);

        airlineReservationSystem.addCustomer(customer1);
        airlineReservationSystem.addCustomer(customer2);
        airlineReservationSystem.addFlight(flight1);
        airlineReservationSystem.addFlight(flight2);

        airlineReservationSystem.makeReservation(customer1, flight1);
        airlineReservationSystem.makeReservation(customer2, flight2);

        airlineReservationSystem.displayReservations();
    }

}
