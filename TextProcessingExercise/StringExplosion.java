package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder result = new StringBuilder(line);
        int totalStrength = 0;

        for (int i = 0; i < result.length(); i++) {
            char symbol = result.charAt(i);
            if (symbol == '>') {
                int attackStrength = Integer.parseInt(result.charAt(i + 1) + "");
                totalStrength += attackStrength;
            } else if (symbol != '>' && totalStrength > 0) {
                result.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(result);
    }
}


