package Utils;

import Entity.Store;
import Entity.Vehicle;

import java.util.List;

public class InventoryManager {

    private List<Store>stores;
    private List<Vehicle>vehicles;

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
