package interfaces.exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Months: ");
        int months = scanner.nextInt();

        InterestService is = new UsaInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.format("%.2f", payment);
        scanner.close();
    }
}
