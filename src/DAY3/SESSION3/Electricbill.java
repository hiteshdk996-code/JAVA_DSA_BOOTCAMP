package DAY3.SESSION3;

import java.util.Scanner;

class CurrentBill {
    double amount(double watts, double hours) {
        return 0;
    }
}

class Fan extends CurrentBill {
    @Override
    double amount(double watts, double hours) {
        return (watts * hours / 1000) * 1.5;
    }
}

class Light extends CurrentBill {
    @Override
    double amount(double watts, double hours) {
        return (watts * hours / 1000) * 1.5;
    }
}

class TV extends CurrentBill {
    @Override
    double amount(double watts, double hours) {
        return (watts * hours / 1000) * 1.5;
    }
}

public class Electricbill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fan watts: ");
        double fw = sc.nextDouble();

        System.out.print("Enter Fan hours: ");
        double fh = sc.nextDouble();

        System.out.print("Enter Light watts: ");
        double lw = sc.nextDouble();

        System.out.print("Enter Light hours: ");
        double lh = sc.nextDouble();

        System.out.print("Enter TV watts: ");
        double tw = sc.nextDouble();

        System.out.print("Enter TV hours: ");
        double th = sc.nextDouble();

        CurrentBill fan = new Fan();
        CurrentBill light = new Light();
        CurrentBill tv = new TV();

        double fanBill = fan.amount(fw, fh);
        double lightBill = light.amount(lw, lh);
        double tvBill = tv.amount(tw, th);

        double total = fanBill + lightBill + tvBill;

        System.out.println("Fan Bill: " + fanBill);
        System.out.println("Light Bill: " + lightBill);
        System.out.println("TV Bill: " + tvBill);
        System.out.println("Total Bill: " + total);

        sc.close();
    }
}