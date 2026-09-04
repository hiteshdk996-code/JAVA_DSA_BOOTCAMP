package DAY3.SESSION2;

class Universe {

    @Override
    protected void finalize() {
        System.out.println("Finalize method called");
    }
}

public class Finalize {

    public static void main(String[] args) {

        new Universe();
        System.gc();
        System.out.println("End of main");
    }
}