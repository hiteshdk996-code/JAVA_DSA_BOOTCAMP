package DAY3.SESSION1;

class Student{
    String name;
    int SRN;
    Student(){
        name =" Goutham";
        SRN=99;
    }
    Student(String name, int SRN){
        this.name=name;
        this.SRN=SRN;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name: "+s1.name);
        System.out.println("SRN: "+s1.SRN);
        Student s2 = new Student("Chandan", 61);
        System.out.println("Name: "+s2.name);
        System.out.println("SRN: "+s2.SRN);
    }
}
