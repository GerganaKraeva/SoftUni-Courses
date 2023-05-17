package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder(word);

        for (int i = 0; i < builder.length()-1; i++) {
            if (builder.charAt(i) == builder.charAt(i + 1)) {
                builder.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(builder);
    }
}
