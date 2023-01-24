import com.sun.jdi.CharValue;

import java.util.Scanner;

public class sumOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfChar = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 1; i <= numberOfChar; i++) {
            char letter = scanner.nextLine().charAt(0);
            int asciiCode = (int) letter;
            sum += asciiCode;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
