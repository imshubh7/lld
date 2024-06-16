package Entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Payment {

    private static Payment instance;

    private Payment(){

    }

    public static Payment getInstance() {
        if (instance == null) {
            instance = new Payment();
        }
        return instance;
    }

    public Long calculateBill(Booking booking){
        int pricePerDay = booking.getVehicle().getPricePerDay();
        long days = getDaysBetween(booking.getStartDate(), booking.getEndDate())+1;
        return pricePerDay* days;
    }

    public boolean completePayment(Booking booking){
        //
        System.out.println("Payment Completed for Booking Id: " + booking.getBookingId());
        System.out.println("Total Paid Bill: "+ calculateBill(booking));
        return true;
    }

    private Long getDaysBetween(LocalDate statDate, LocalDate endDate){
        return ChronoUnit.DAYS.between(statDate, endDate);
    }

}
