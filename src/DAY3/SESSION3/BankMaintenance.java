package DAY3.SESSION3;

import java.util.Scanner;

class Account {

    String name;
    int number;
    double balance;
    String startDate;

    Account(String name, int number, double balance, String startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }

    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    double getBalance() {
        return balance;
    }

    String getStartDate() {
        return startDate;
    }
}

interface MaintenanceCharge {

    float computeMaintenanceCharge(int n);
}

class CurrentAccount extends Account implements MaintenanceCharge {

    CurrentAccount(String name, int number, double balance, String startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public float computeMaintenanceCharge(int n) {
        return (100 * n) + 200;
    }
}

class SavingsAccount extends Account implements MaintenanceCharge {

    SavingsAccount(String name, int number, double balance, String startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public float computeMaintenanceCharge(int n) {
        return (2 * 50 * n) + 50;
    }
}

public class BankMaintenance {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Account Number");
        int number = sc.nextInt();

        System.out.println("Account Balance");
        double balance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        String startDate = sc.nextLine();

        System.out.println("Enter the Years");
        int n = sc.nextInt();
        if (choice == 1) {

            CurrentAccount account =
                    new CurrentAccount(name, number, balance, startDate);

            System.out.printf(
                    "Maintenance Charge For Current Account %.2f%n",
                    account.computeMaintenanceCharge(n)
            );

        } else if (choice == 2) {

            SavingsAccount account =
                    new SavingsAccount(name, number, balance, startDate);

            System.out.printf(
                    "Maintenance Charge For Savings Account %.2f%n",
                    account.computeMaintenanceCharge(n)
            );
        }

        sc.close();
    }

}
