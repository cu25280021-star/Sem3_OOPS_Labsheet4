class EncapsulatedMedicine {
    private String batchNumber;
    private String name;
    private double price;

    public EncapsulatedMedicine(String batchNumber, String name, double price) {
        this.batchNumber = batchNumber;
        this.name = name;
        this.price = price;
    }

    public void displayProductData() {
        System.out.println("Batch No : " + batchNumber);
        System.out.println("Medicine : " + name);
        System.out.println("Price    : $" + price);
    }
}

public class EncapsulatedMedicineMain {
    public static void main(String[] args) {
        EncapsulatedMedicine med = new EncapsulatedMedicine("B78921", "Metformin", 15.75);
        med.displayProductData();
    }
}