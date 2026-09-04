package DAY3.HW;
class Father {
    void skill(){
        System.out.println("Father can drive");
    }
}

class Son {
    Father f = new Father();
    void show() {
        f.skill();
        System.out.println("Son can play cricket");
    }
}
public class InheritanceWithoutExtanceKeyword {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
    }
}
