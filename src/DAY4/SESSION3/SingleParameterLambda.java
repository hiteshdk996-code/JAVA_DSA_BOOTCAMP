package DAY4.SESSION3;

@FunctionalInterface
interface Greet2{
    void SayHello2(String name);
}
interface Greet3{
    void SayHello3(String name);
}
public class SingleParameterLambda {
    public static void main(String[] args) {
        Greet2 g = (name) -> System.out.println("Hello, " + name + "!");
        g.SayHello2("Alice");
        Greet3 g3 = (name) -> System.out.println("Hello, " + name + "!");
        g3.SayHello3("Hima");
    }
}