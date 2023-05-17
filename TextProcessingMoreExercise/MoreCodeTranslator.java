package TextProcessingMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MoreCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] message=scanner.nextLine().split(" ");
        String [] code={ ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..","|"};
        Map<String,Character> morseToEnglish=new LinkedHashMap<>();
        StringBuilder newText= new StringBuilder();
        for (int i = 0; i < 26; i++) {
            morseToEnglish.put(code[i], (char)('A'+i));
        }
        for (int i = 0; i < message.length; i++) {
            String currentWord = message[i];
            if (!currentWord.equals("|")) {
                newText.append(morseToEnglish.get(currentWord));
            } else {
                newText.append(' ');
            }
        }
        System.out.println(newText);
    }
}
