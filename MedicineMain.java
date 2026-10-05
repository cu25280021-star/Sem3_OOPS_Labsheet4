class Medicine {
    private String name;
    private double price;

    public Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Medicine Name: " + name + ", Price: $" + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine med = new Medicine("Paracetamol", 5.50);
        med.displayInfo();
    }
}