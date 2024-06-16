package Entity;

import java.util.List;

public class Vehicle {
    private final String id;
    private Boolean active;
    private VehicleType vehicleType;
    private Integer pricePerDay;
    private List<Booking>bookings;

    public Vehicle(String id, Boolean active, VehicleType vehicleType, Integer pricePerDay, List<Booking> bookings) {
        this.id = id;
        this.active = active;
        this.vehicleType = vehicleType;
        this.pricePerDay = pricePerDay;
        this.bookings = bookings;
    }

    public String getId() {
        return id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public List<Booking> getBookings() {
        System.out.println("Getting Bookings");
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
