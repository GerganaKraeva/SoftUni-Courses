package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = scanner.nextLine().split(", ");

        for (int i = 0; i < userNames.length; i++) {
            String user = userNames[i];
            if(areCorrectSymbols(user)){
                System.out.println(user);
            }
        }
    }

    private static boolean areCorrectSymbols(String word) {
        if(word.length()<3 ||word.length()>16){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == '-' || symbol == '_') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
