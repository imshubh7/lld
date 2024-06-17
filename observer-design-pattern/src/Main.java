import observable.IphoneStockObservable;
import observable.StockObservable;
import observer.MobileObserver;
import observer.StockObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        StockObserver stockObserver = new MobileObserver(iphoneStockObservable);
        iphoneStockObservable.add(stockObserver);
        iphoneStockObservable.setStock(10);
        iphoneStockObservable.setStock(1);

    }
}