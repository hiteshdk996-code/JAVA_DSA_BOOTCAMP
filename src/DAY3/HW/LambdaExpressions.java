package DAY3.HW;

interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExpressions {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println(add.calculate(10, 5));
        System.out.println(sub.calculate(10, 5));
        System.out.println(mul.calculate(10, 5));
        System.out.println(div.calculate(10, 5));
    }
}