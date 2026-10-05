class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayPerson() {
        System.out.println("Person Name: " + name);
    }
}

class Employee extends Person {
    protected int employeeId;

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritanceMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Robert Green", 501, "Pharmacy Management");
        manager.displayManager();
    }
}