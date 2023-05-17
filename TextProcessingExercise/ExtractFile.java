package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pathToFile=scanner.nextLine();
        int indexBeforeName=pathToFile.lastIndexOf(92);
        int indexOfLastDot=pathToFile.lastIndexOf(46);
        String word=pathToFile.substring(indexBeforeName+1,indexOfLastDot);
        String extension=pathToFile.substring(indexOfLastDot+1);
        System.out.printf("File name: %s\n",word);
        System.out.printf("File extension: %s\n",extension);

    }
}
