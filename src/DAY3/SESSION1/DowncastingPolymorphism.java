package DAY3.SESSION1;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void skill() {
        System.out.println("Dog is playing with the ball");
    }
}

class Dog2 extends Dog {

    @Override
    void sound() {
        System.out.println("Dog2 barks");
    }

    void skill() {
        System.out.println("Dog2 is playing with the doll");
    }
}

public class DowncastingPolymorphism {

    public static void main(String[] args) throws Exception {

        Animal a = new Dog2();

        Dog2 d = (Dog2) a;   // Downcasting

        d.skill();
        d.sound();
    }
}