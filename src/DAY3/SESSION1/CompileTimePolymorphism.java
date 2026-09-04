package DAY3.SESSION1;

class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    double add(int a, int b, int c){
        return a+b+c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        calculator c = new calculator(); 
        System.out.println(c.add(10, 20));   
        System.out.println(c.add(10.5, 20.6 ));   
        System.out.println(c.add(10, 20, 30));
    }
}
