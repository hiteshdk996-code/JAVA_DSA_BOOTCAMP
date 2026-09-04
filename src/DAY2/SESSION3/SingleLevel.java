package DAY2.SESSION3;

class Father {
    String name;

    void skill() {
        System.out.println("Riding a bike");
    }
}

public class SingleLevel {
    class child extends Father {
        String name;

        void skill() {
            System.out.println("Crashing a bike");
        }
    }

    public static void main(String[] args) {
        SingleLevel outer = new SingleLevel();
        SingleLevel.child c = outer.new child();
        c.skill();

        Father f = new Father();
        f.skill();
    }
}