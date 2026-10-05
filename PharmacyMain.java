class Pharmacy {
    public static String pharmacyName = "City Health Pharmacy";
    public static String location = "Downtown Central";

    private String branchCode;

    public Pharmacy(String branchCode) {
        this.branchCode = branchCode;
    }

    public void displayDetails() {
        System.out.println("Branch Code: " + branchCode + " | Pharmacy: " + pharmacyName + " | Location: " + location);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy branch1 = new Pharmacy("B-101");
        Pharmacy branch2 = new Pharmacy("B-102");

        System.out.println("--- Initial Details ---");
        branch1.displayDetails();
        branch2.displayDetails();

        Pharmacy.pharmacyName = "Global Health Pharmacy";

        System.out.println("\n--- After Static Variable Modification ---");
        branch1.displayDetails();
        branch2.displayDetails();
    }
}