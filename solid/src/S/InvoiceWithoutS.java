package S;

public class InvoiceWithoutS {
    private int quantity;
    private int price;

    public InvoiceWithoutS(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getTotal() {
        return quantity* price;
    }

    public void printReceipt(){
        //do something
    }

    public void saveToDB(){
        //save to db
    }

    /*
    It has three reasons to change
     */
}
