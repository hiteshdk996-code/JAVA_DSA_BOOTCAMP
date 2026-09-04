package DAY6.SESSION1;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CheckedCustomException {
    public static void main(String[] args) {
        int age = 19;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible for licence");
            }
            System.out.println("Eligible for licence");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
