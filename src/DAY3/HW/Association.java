package DAY3.HW;
class Student {
    String name = "John";
}

class Teacher {
    void teach(Student s) {
        System.out.println("Teacher teaches " + s.name);
    }
}

public class Association {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.teach(s);
    }
}