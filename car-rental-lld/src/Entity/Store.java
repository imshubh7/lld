package Entity;

import Utils.InventoryManager;

public class Store {
    private final String id;
    private Location location;
    private InventoryManager inventoryManager;

    public Store(String id,Location location, InventoryManager inventoryManager) {
        this.id = id;
        this.location = location;
        this.inventoryManager = inventoryManager;
    }

    public String getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }

    public void setInventoryManager(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }
}
