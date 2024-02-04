package src.ders.ders9and10.akis002;

import java.util.Date;

public class Reservation {
    private String reservationNumber;
    private Customer customer;
    private Flight flight;
    private Date reservationDate;

    public Reservation(String reservationNumber, Customer customer, Flight flight, Date reservationDate) {
        this.reservationNumber = reservationNumber;
        this.customer = customer;
        this.flight = flight;
        this.reservationDate = reservationDate;
    }

    public Reservation() {
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
