package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] banWords=scanner.nextLine().split(", ");
        String text=scanner.nextLine();

        for (int i = 0; i <banWords.length ; i++) {
            String word=banWords[i];
            String asteriks=getChangedWord(word.length());
            text=text.replace(word,asteriks);
        }
        System.out.println(text);
    }

    private static String getChangedWord(int n) {
        String newWord="";
        for (int i = 0; i < n; i++) {
            newWord+="*";
        }
        return newWord;
    }
}
