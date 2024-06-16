package entity;

public class Payment {
    private static Payment payment;
    private Payment(){

    }
    public static Payment getInstance(){
        if(payment==null){
            payment = new Payment();
        }
        return payment;
    }

    public static Boolean CompletePayment(Booking booking){
        System.out.println("Completed Payment for Booking"+ booking.toString());
        return true;
    }
}
