package DAY3.SESSION3;

interface Parent1 {
    void display1();
}

interface Parent2 {
    void display2();
}

class Child implements Parent1, Parent2 {

    public void display1() {
        System.out.println("This is Parent 1");
    }

    public void display2() {
        System.out.println("This is Parent 2");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Child child = new Child();
        child.display1();
        child.display2();
    }
}