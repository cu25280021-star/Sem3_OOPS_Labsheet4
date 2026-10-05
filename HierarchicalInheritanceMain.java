class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void displayBaseInfo() {
        System.out.println("ID: " + empId + " | Name: " + name);
    }
}

class Doctor extends Employee {
    private String specialization;

    public Doctor(int empId, String name, String specialization) {
        super(empId, name);
        this.specialization = specialization;
    }

    public void displayDoctor() {
        displayBaseInfo();
        System.out.println("Role: Doctor | Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String shift;

    public Pharmacist(int empId, String name, String shift) {
        super(empId, name);
        this.shift = shift;
    }

    public void displayPharmacist() {
        displayBaseInfo();
        System.out.println("Role: Pharmacist | Shift: " + shift);
    }
}

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        Doctor doc = new Doctor(201, "Dr. Sarah", "Cardiology");
        Pharmacist pharm = new Pharmacist(202, "Alex", "Night");

        doc.displayDoctor();
        System.out.println("--------------------");
        pharm.displayPharmacist();
    }
}