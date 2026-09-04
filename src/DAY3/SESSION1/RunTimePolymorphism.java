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
    }                                                 // @Override is used to override the method of parent class in child class
    class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("meows");
        }
    }
    class Elephant extends Animal{
        @Override
        void sound(){
            System.out.println("Wranks");
        }
    }
}
public class RunTimePolymorphism {

    public static void main(String[] args) {}
    
}
