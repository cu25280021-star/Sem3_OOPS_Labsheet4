class GrandParent {
    void displayGP() {
        System.out.println("GrandParent class");
    }
}

class Parent1 extends GrandParent {
    void displayP1() {
        System.out.println("Parent1 class");
    }
}

class Parent2 extends GrandParent {
    void displayP2() {
        System.out.println("Parent2 class");
    }
}

class Child1 extends Parent1 {
    void displayC1() {
        System.out.println("Child1 extending Parent1");
    }
}

public class HybridInheritanceConcept {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.displayGP();
        child.displayP1();
        child.displayC1();
    }
}