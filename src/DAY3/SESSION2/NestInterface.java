package DAY3.SESSION2;

class Home {

    interface window {
        void onClose();
    }
}

class app implements Home.window {

    @Override
    public void onClose() {
        System.out.println("Window closed");
    }
}

public class NestInterface {

    public static void main(String[] args) {
        Home.window w = new app();
        w.onClose();
    }
}