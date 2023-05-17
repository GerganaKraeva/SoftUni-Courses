package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userInput=scanner.nextLine();
        String firstWord=userInput.split(" ")[0];
        String secondWord=userInput.split(" ")[1];
        int minLength=Math.min(firstWord.length(),secondWord.length());
        int sum=0;
        for (int i = 0; i < minLength; i++) {
            sum+=(firstWord.charAt(i)*secondWord.charAt(i));
        }
        String biggerWord=getLarger(firstWord,secondWord);
        String remainder=biggerWord.substring(minLength);

        for (int i = 0; i < remainder.length(); i++) {
            sum+=remainder.charAt(i);
        }

        System.out.println(sum);

    }

    private static String getLarger(String first, String second) {
        if(first.length()>second.length()){
            return first;
        }else{
            return second;
        }
    }
}
