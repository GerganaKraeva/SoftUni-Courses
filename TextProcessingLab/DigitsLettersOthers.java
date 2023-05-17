package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < userInput.length(); i++) {
            char symbol = userInput.charAt(i);
            if (Character.isDigit(symbol)) {
                digit = digit.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letter = letter.append(symbol);
            } else {
                other = other.append(symbol);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);
    }
}
