package observer;

import observable.IphoneStockObservable;
import observable.StockObservable;

public class MobileObserver implements StockObserver{

    private final StockObservable stockObservable;

    public MobileObserver(StockObservable iphoneStockObservable){
        this.stockObservable = iphoneStockObservable;
    }
    @Override
    public void update() {
        System.out.println("Update Called with stock "+ stockObservable.getStock());
    }
}
