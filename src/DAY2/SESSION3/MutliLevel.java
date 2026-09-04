package DAY2.SESSION3;

class GrandFather {
    String name;
    void skills() {
        System.out.println("Story Telling");
    }
}
class Father extends GrandFather {
    String name;
    void skill() {
        System.out.println("Ride");
    }
}
class son extends Father {
    String name;
    void skill() {
        System.out.println("Crashing a bike");
    }
}
public class MutliLevel {
    public static void main(String[] args) {
        son s = new son();
        s.skills();
        s.skill();
    }
}
