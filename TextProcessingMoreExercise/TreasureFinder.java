package TextProcessingMoreExercise;

import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] keys = userInput.split(" ");
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();
        int start=0;
        while (!text.equals("find")) {
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                for (int j = start; j < keys.length; j++) {
                    int keyToDecrease = Integer.parseInt(keys[j]);
                    symbol -= keyToDecrease;
                    newText.append(symbol);
                    break;
                }
                start++;
                if(start>keys.length-1){
                    start=0;
                }
            }
            String result=newText.toString();
            String found=getWord(result,'&','&');
            String coordinates=getWord(result,'<','>');
            System.out.printf("Found %s at %s\n",found,coordinates);
            start=0;
            newText=new StringBuilder();
            text = scanner.nextLine();
        }
    }

    private static String getWord(String word,char symbol,char symbol2) {
        int indexStart=word.indexOf(symbol);
        int indexEnd=word.lastIndexOf(symbol2);
        String newWord=word.substring(indexStart+1,indexEnd);
        return newWord;
    }
}
