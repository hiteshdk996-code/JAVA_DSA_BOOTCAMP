package DAY3.SESSION1;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("barks");                // @ stands for Anotation
    }                
    void skill(){
        System.out.println("Dog is playing with the ball");
    }   
}
public class UpcastingPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();
        ((Dog) a).skill(); // Downcasting to access Dog-specific methods
    }
    
}
