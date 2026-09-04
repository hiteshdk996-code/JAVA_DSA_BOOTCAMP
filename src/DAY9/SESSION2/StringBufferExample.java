package DAY9.SESSION2;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JAVA");
        StringBuilder sbu = new StringBuilder("JAVA");

        sb.append("Program");
        sbu.append("Program");

        System.out.println(sb);
        System.out.println(sbu);
    }
}