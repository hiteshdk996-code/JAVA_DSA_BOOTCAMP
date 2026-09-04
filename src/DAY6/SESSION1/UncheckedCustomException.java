package DAY6.SESSION1;

class InvalidMarksException extends RuntimeException{
    public InvalidMarksException(String message){
        super(message);
    }
}
public class UncheckedCustomException {
    public static void marksCheck(int marks){
        if(marks<0|| marks>100){
            throw new InvalidMarksException("Marks Invalid");
        }
        System.out.println("Valid Marks"+marks);
    }
    public static void main(String[] args) {
        try{
                marksCheck(100);
        }catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        }
    }
}
