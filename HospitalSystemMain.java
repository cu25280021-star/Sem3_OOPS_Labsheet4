class StaffMember {
    private int id;
    private String name;
    private String department;

    public StaffMember(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID        : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + department);
    }
}

class HospitalSystem {
    private StaffMember[] staffList;

    public HospitalSystem() {
        staffList = new StaffMember[] {
            new StaffMember(1001, "Dr. Alice Vance", "Emergency"),
            new StaffMember(1002, "Bob Martin", "Pharmacy"),
            new StaffMember(1003, "Carol White", "Pediatrics")
        };
    }

    public void runSystem() {
        System.out.println("====================================");
        System.out.println("   HOSPITAL MANAGEMENT SYSTEM       ");
        System.out.println("====================================");
        for (StaffMember staff : staffList) {
            staff.displayDetails();
            System.out.println("------------------------------------");
        }
    }
}

public class HospitalSystemMain {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.runSystem();
    }
}