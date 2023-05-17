package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstInput=scanner.nextLine();
        String secondInput=scanner.nextLine();

        while(secondInput.contains(firstInput)){
           secondInput= secondInput.replace(firstInput,"");
        }
        System.out.println(secondInput);
    }
}
