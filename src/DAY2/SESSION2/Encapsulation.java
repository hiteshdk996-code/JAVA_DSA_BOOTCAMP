package DAY2.SESSION2;

class Person {
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setBalance(1000);
        System.out.println("Balance: " + p.getBalance());
    }


    
}
