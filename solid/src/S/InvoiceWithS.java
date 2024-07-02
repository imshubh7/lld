package S;

public class InvoiceWithS {
    int price;
    int quantity;

    public InvoiceWithS(int price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotal(){
        return price* quantity;
    }

    //Other Methods move to different class
}
