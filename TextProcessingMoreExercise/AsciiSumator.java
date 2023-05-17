package TextProcessingMoreExercise;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String random = scanner.nextLine();
        char maxChar=getMaxChar(first,second);
        char minChar=getMinChar(first,second);
        int sum=0;
        for (int i = 0; i < random.length(); i++) {
            char current=random.charAt(i);
            if(current>minChar &&current<maxChar){
              sum+=current;
            }
        }
        System.out.println(sum);

    }

    private static char getMinChar(char one,char two) {
        if(one<two){
            return one;
        }
        return two;
    }

    private static char getMaxChar(char one,char two) {
        if(one>two){
            return one;
        }
        return two;
    }
}
