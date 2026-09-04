package DAY9.SESSION1;

public class program2 {
    String s1 = "Pooja";
    String s2 = "Pooja";
    String s3 = new String("Pooja");

    public static void main(String[] args) {
        program2 obj = new program2();

        System.out.println(obj.s1 == obj.s2);
        System.out.println(obj.s1 == obj.s3);

        System.out.println(obj.s1.equals(obj.s2));
        System.out.println(obj.s1.equals(obj.s3));
    }
}
