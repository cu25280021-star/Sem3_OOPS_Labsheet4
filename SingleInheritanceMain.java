class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

class Pharmacist extends Employee {
    private String licenseNumber;

    public Pharmacist(int empId, String name, String licenseNumber) {
        super(empId, name);
        this.licenseNumber = licenseNumber;
    }

    public void displayPharmacistDetails() {
        displayEmployeeDetails();
        System.out.println("License Number: " + licenseNumber);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(101, "David Miller", "PH-99201");
        pharmacist.displayPharmacistDetails();
    }
}