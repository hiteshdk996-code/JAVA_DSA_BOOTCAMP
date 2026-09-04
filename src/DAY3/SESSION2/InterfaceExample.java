package DAY3.SESSION2;

interface Animal {
    final int num=10;
    default void eat(){
        System.out.println();
    }
    void sleep();
}
class Monkey implements Animal{
    
    public void eat(){
        System.out.println("Monkey eats banana");
    }
    public void sleep(){
        System.out.println("Monkey sleeps on tree");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal a = new Monkey();
        a.eat();
        a.sleep();
    }
    
}
