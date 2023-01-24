import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counterStart = 0;
        int counterEnd = 0;
        boolean isStart = false;
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char symbol = input.charAt(0);
                if (symbol == 40 && counter == 0) {
                    isStart = true;
                    counter++;
                }
                if (symbol == 40) {
                    counterStart++;
                }
                if (symbol == 41) {
                    if ((counterStart - 1) == counterEnd) {
                        counterEnd++;
                    } else {
                        isStart = false;
                    }
                }
            }
        }
        if (isStart) {
            if (counterStart == counterEnd) {
                System.out.println("BALANCED");
            } else {
                System.out.println("UNBALANCED");
            }
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
