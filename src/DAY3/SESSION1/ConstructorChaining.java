package DAY3.SESSION1;

class Student{
    String name;
    int age;
    String course;

    public Student(String name, int age, String course){
        this.name= name;
        this.age=age;
        this.course = course;
    }

    public Student(){
        this("Bavith",18,"DAS");
    }
    void view(){
        System.out.println(name+" "+age+" "+course);
    }
}
class child extends Student{
    public child(){
    super("Varun", 20 , "AIML");
}
}

public class ConstructorChaining {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.view();
    }
}
