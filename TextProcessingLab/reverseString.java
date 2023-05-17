package TextProcessingLab;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userWord=scanner.nextLine();


        while (!userWord.equals("end")){
            String reverseWord="";
            for (int i = userWord.length()-1; i >= 0; i--) {
                char symbol=userWord.charAt(i);
                reverseWord=reverseWord+symbol;
            }
            System.out.printf("%s = %s\n",userWord,reverseWord);
            userWord=scanner.nextLine();
        }
    }
}
