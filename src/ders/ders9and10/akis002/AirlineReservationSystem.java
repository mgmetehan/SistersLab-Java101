package src.ders.ders9and10.akis002;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineReservationSystem {
    //!!Airline Reservation System
    private List<Customer> customers = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void makeReservation(Customer customer, Flight flight) {
        Reservation reservation = new Reservation();
        reservation.setCustomer(customer);
        reservation.setFlight(flight);
        reservation.setReservationDate(new Date());
        reservation.setReservationNumber("F" + this.reservations.size() + 1);

        this.reservations.add(reservation);
        System.out.println("Reservation made success!!");
        System.out.println("Reservation no: " + reservation.getReservationNumber());
    }

    public void displayReservations() {
        System.out.println("All reservation: ");
        for (Reservation res : this.reservations) {

            System.out.println(
                    "Reservation no: " + res.getReservationNumber() +
                            "Reservation name:" + res.getCustomer().getFirstName() +
                            "Reservation flight: " + res.getFlight().getFlightNumber()
            );
        }
    }

    @Override
    public String toString() {
        return "AirlineReservationSystem{" +
                "customers=" + customers +
                ", flights=" + flights +
                ", reservations=" + reservations +
                '}';
    }

    public AirlineReservationSystem() {
    }
}
