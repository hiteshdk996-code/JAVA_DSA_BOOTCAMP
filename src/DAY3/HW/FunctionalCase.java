package DAY3.HW;

interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalCase {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Subtraction: " + sub.calculate(10, 5));
        System.out.println("Multiplication: " + mul.calculate(10, 5));
    }
}