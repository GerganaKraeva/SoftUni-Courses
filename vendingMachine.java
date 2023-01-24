import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        String input = scanner.nextLine();
        String product = "";

        while (!input.equals("End")) {
            if (input.equals("End")) {
                break;
            }
            while (!input.equals("Start")) {
                if (input.equals("2") || input.equals("1") || input.equals("0.1") || input.equals("0.2") || input.equals("0.5")) {
                    sum += Double.parseDouble(input);
                } else {
                    double money = Double.parseDouble(input);
                    System.out.printf("Cannot accept %.2f%n", money);
                }
                input = scanner.nextLine();
            }
            if (input.equals("Start")) {
                product = scanner.nextLine();
                if (product.equals("End")) {
                    System.out.printf("Change: %.2f",sum);
                    break;
                }
                switch (product) {
                    case ("Coke"):
                        if (sum >= 1) {
                            sum -= 1;
                            System.out.println("Purchased Coke");
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case ("Soda"):
                        if (sum >= 0.8) {
                            sum -= 0.8;
                            System.out.println("Purchased Soda");
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case ("Nuts"):
                        if (sum >= 2) {
                            sum -= 2;
                            System.out.println("Purchased Nuts");
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case ("Crisps"):
                        if (sum >= 1.5) {
                            sum -= 1.5;
                            System.out.println("Purchased Crisps");
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case ("Water"):
                        if (sum >= 0.7) {
                            sum -= 0.7;
                            System.out.println("Purchased Water");
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    default:
                        System.out.println("Invalid product");
                }
            }
        }
    }
}