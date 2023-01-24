import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double currentBalance = balance;
        double outfall4 = 39.99;
        double c5og = 15.99;
        double zplingerZell = 19.99;
        double honored2 = 59.99;
        double roverWatch = 29.99;
        double roverWatchOrigin = 39.99;
        String userInput = "";


        while (!userInput.equals("Game Time")) {
            userInput = scanner.nextLine();

            if (userInput.equals("Game Time")) {
                break;
            }
            if (currentBalance == 0) {
                System.out.println("Out of money");
                break;
            }
            switch (userInput) {
                case ("OutFall 4"):
                    if (currentBalance >= 39.99) {
                        currentBalance -= 39.99;
                        System.out.printf("Bought %s%n", userInput);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case ("CS: OG"):
                    if (currentBalance >= 15.99) {
                        currentBalance -= 15.99;
                        System.out.printf("Bought %s%n", userInput);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case ("Zplinter Zell"):
                    if (currentBalance >= 19.99) {
                        currentBalance -= 19.99;
                        System.out.printf("Bought %s%n", userInput);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case ("Honored 2"):
                    if (currentBalance >= 59.99) {
                        currentBalance -= 59.99;
                        System.out.printf("Bought %s%n", userInput);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case ("RoverWatch"):
                    if (currentBalance >= 29.99) {
                        currentBalance -= 29.99;
                        System.out.printf("Bought %s%n", userInput);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case ("RoverWatch Origins Edition"):
                    if (currentBalance >= 39.99) {
                        currentBalance -= 39.99;
                        System.out.printf("Bought %s%n", userInput);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not fount");
            }
        }
        if (currentBalance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", balance - currentBalance, currentBalance);
        }else{
            System.out.println("Out of money!");
        }
    }
}
