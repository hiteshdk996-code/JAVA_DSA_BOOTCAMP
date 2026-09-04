package DAY3.SESSION2;
final class Wallet{
    final int capacity = 100;

    final void dispaly(){
        System.out.println(capacity);

    }
}
public class FinalKeywordUsage {

    public static void main(String[] args) {
        Wallet W = new Wallet();
        W.dispaly();
    }
}
