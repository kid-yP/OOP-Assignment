import java.util.Scanner;

public class MonetaryAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a monetary amount: ");
        double amount = scanner.nextDouble();

        int cents = (int) Math.round(amount * 100);

        int tenDollarBills = cents / 1000;
        cents %= 1000;

        int fiveDollarBills = cents / 500;
        cents %= 500;

        int oneDollarBills = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        System.out.println(tenDollarBills + " ten dollar bills");
        System.out.println(fiveDollarBills + " five dollar bills");
        System.out.println(oneDollarBills + " one dollar bills");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
