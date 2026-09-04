package DAY2.HW;

public class PrivateConstructor {

    class Student {

        private Student() {
            System.out.println("Private constructor called");
        }
    }

    public static void main(String[] args) {

        PrivateConstructor obj = new PrivateConstructor();
        obj.new Student();
    }
}