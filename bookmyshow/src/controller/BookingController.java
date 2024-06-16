package controller;

import entity.Booking;
import entity.Seat;

import java.util.List;

public class BookingController {

    public static Booking bookTicket(String id, List<Seat>seatList, String showId){
        Booking booking =  new Booking(id, seatList, showId);
        System.out.println("Booking done for : " + booking);
        return booking;
    }
}
