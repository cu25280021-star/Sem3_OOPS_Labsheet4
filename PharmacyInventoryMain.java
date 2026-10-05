class MedicineStock {
    private String name;
    private int quantity;

    public MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void displayStock() {
        System.out.println("Medicine: " + name + " | Stock Quantity: " + quantity);
    }
}

class Inventory {
    private MedicineStock[] stocks;

    public Inventory() {
        stocks = new MedicineStock[] {
            new MedicineStock("Amoxicillin", 120),
            new MedicineStock("Ibuprofen", 200),
            new MedicineStock("Aspirin", 85)
        };
    }

    public void displayInventory() {
        System.out.println("=== Pharmacy Inventory Stock ===");
        for (MedicineStock stock : stocks) {
            stock.displayStock();
        }
    }
}

public class PharmacyInventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}