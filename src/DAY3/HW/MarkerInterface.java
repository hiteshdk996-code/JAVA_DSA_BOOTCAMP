package DAY3.HW;
interface StudentMarker {
    // Empty interface
}
class Students implements StudentMarker {
    String name = "Goutham";
    void display() {
        System.out.println("Student name: " + name);
    }
}
public class MarkerInterface {
    public static void main(String[] args) {
        Students s = new Students();
        s.display();
    }
}