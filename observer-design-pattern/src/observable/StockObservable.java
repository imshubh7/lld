package observable;

import observer.StockObserver;

public interface StockObservable {
    public void add(StockObserver stockObserver);
    public void remove(StockObserver stockObserver);
    public void notifySubscribers();
    public void setStock(Integer stock);
    public int getStock();

}
