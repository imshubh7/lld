import Entity.*;
import Utils.InventoryManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Location location = new Location("Lucknow", 226010);
        Vehicle vehicle = new Vehicle("1",true, VehicleType.FOUR_WHEELER, 400, new ArrayList<>());
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(vehicle);

        //CREATE STORE
        Store lko = new Store("1",location, new InventoryManager());
        lko.getInventoryManager().setVehicles(vehicleList);



        // USER Created Account
        User user1 = new User("1", "Shubham");

        //USER Finds Store

        //USER Making Booking

        Booking booking = new Booking("1", user1, LocalDate.of(2024, 6, 16),LocalDate.of(2024, 6, 25),  vehicle);

        Payment payment = Payment.getInstance();
        payment.completePayment(booking);

        lko.getInventoryManager().getVehicles().get(0).getBookings().add(booking);


    }
}