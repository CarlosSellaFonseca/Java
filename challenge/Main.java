import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type credit card limit: ");
        double limit = input.nextDouble();
        CreditCard card = new CreditCard(limit);

        int quit = 1;
        while(quit != 0) {
            System.out.println("Type purchase description: ");
            String desc = input.next();

            System.out.println("Type purchase value: ");
            double value = input.nextDouble();

            Purchase purchase = new Purchase(desc, value);
            boolean purchaseMade = card.registerPurchase(purchase);

            if (purchaseMade) {
                System.out.println("Purchase made!");
                System.out.println("Type 0 to quit or 1 to continue");
                quit = input.nextInt();
            } else {
                System.out.println("Purchase was not made!");
                quit = 0;
            }
        }

        System.out.println("Purchases made:\n");
        Collections.sort(card.getPurchases());

        for (Purchase p : card.getPurchases()) {
            System.out.println(p.getDesc() + " - " + p.getValue());
        }

        System.out.println("Credit card balance: " + card.getBalance());

    }
}
