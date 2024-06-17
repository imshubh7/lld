package observable;

import observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    List<StockObserver>stockObserverList;
    Integer stock;
    public IphoneStockObservable(){
        stockObserverList = new ArrayList<>();
        stock=5;
    }
    @Override
    public void add(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
    }

    @Override
    public void remove(StockObserver stockObserver) {
        stockObserverList.remove(stockObserver);
    }

    @Override
    public void notifySubscribers() {
        for(StockObserver stockObserver : stockObserverList){
            stockObserver.update();
        }
    }

    @Override
    public void setStock(Integer stock) {
        this.stock =stock;
        notifySubscribers();
    }

    @Override
    public int getStock() {
        return stock;
    }
}
