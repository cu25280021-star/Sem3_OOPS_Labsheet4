class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Alice Smith", 101);
        student.display();
    }
}