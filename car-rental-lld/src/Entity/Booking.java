package Entity;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;
    private Vehicle vehicle;


    public Booking(String bookingId, User user, LocalDate startDate, LocalDate endDate, Vehicle vehicle) {
        this.bookingId = bookingId;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.vehicle = vehicle;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
