package TextProcessingLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]array=scanner.nextLine().split(" ");

        for (int i = 0; i < array.length; i++) {
            String word=array[i];
            int n=word.length();
            String changeWord=getNewWord(n,word);
            array[i]=changeWord;
        }
        System.out.println(String.join("",array));
    }

    private static String getNewWord(int n,String word) {
        String newWord="";
        for (int i = 0; i < n; i++) {
            newWord +=word;
        }
        return newWord;
    }
}
