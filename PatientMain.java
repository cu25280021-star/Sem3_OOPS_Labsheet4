class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void classifyPatient() {
        System.out.print("Patient " + name + " (" + age + " yrs): ");
        if (age >= 60) {
            System.out.println("Classified as Senior Citizen Patient.");
        } else if (age >= 18) {
            System.out.println("Classified as Adult Patient.");
        } else {
            System.out.println("Classified as Pediatric Patient.");
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient("John", 65);
        Patient p2 = new Patient("Emma", 28);
        Patient p3 = new Patient("Leo", 10);

        p1.classifyPatient();
        p2.classifyPatient();
        p3.classifyPatient();
    }
}