import java.util.Scanner;

public class cc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to currency converter");
        System.out.println("1 INR");
        System.out.println("2 USD");
        System.out.println("3 EUR");
        System.out.println("4 JPY");
        System.out.print("Enter your currency code : ");
        String code = scanner.nextLine().toUpperCase();
        if ("INR".equals(code)) {
            System.out.print("Enter the Currency code to convert :");
            String code2 = scanner.nextLine().toUpperCase();
            if ("USD".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = $" + (amount * 0.012));
            }
            if ("EUR".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = €" + (amount * 0.010));
            } else if ("JPY".equals(code2)) {
                System.out.print("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.println("The converted amount in usd is = ¥" + (amount * 1.67));
            }
            else if (!"JPY".equals(code2) && !"USD".equals(code2) && !"EUR".equals(code2)) {
                System.out.println("Invalid Currency Code");
            }
        }
        if ("USD".equals(code)) {
            System.out.print("Enter the Currency code to convert :");
            String code2 = scanner.nextLine().toUpperCase();
            if ("INR".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = ₹" + (amount * 86.25));
            }
            if ("EUR".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = €" + (amount * 0.87));
            }
            if ("JPY".equals(code2)) {
                System.out.print("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.println("The converted amount in usd is = ¥" + (amount * 144.14));
            }
            else if (!"INR".equals(code2) && !"JPY".equals(code2) && !"EUR".equals(code2))
                System.out.println("Invalid Currency Code");
        }
        if ("EUR".equals(code)) {
            System.out.print("Enter the Currency code to convert :");
            String code2 = scanner.nextLine().toUpperCase();
            if ("INR".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = ₹" + (amount * 99.43));
            }
            if ("USD".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = $" + (amount * 1.16));
            }
            if ("JPY".equals(code2)) {
                System.out.print("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.println("The converted amount in usd is = ¥" + (amount * 166.48));
            }
            else if (!"INR".equals(code2) && !"USD".equals(code2) && !"JPY".equals(code2))
                System.out.println("Invalid Currency Code");
        }
        if ("JPY".equals(code)) {
            System.out.print("Enter the Currency code to convert :");
            String code2 = scanner.nextLine().toUpperCase();
            if ("INR".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = ₹" + (amount * 0.59));
            }
            if ("USD".equals(code2)) {
                System.out.println("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.print("The converted amount in usd is = $" + (amount * 0.0069));
            }
            if ("EUR".equals(code2)) {
                System.out.print("enter the amount to convert : ");
                double amount = scanner.nextDouble();
                System.out.println("The converted amount in usd is = €" + (amount * 0.0060));
            }
            else if (!"INR".equals(code2) && !"USD".equals(code2) && !"EUR".equals(code2))
                System.out.println("Invalid Currency Code");

        }
        else if (!"INR".equals(code) && !"USD".equals(code) && !"EUR".equals(code) && !"JPY".equals(code)) {
            System.out.println("Invalid Currency Code");
        }
        scanner.close();

    }
}
