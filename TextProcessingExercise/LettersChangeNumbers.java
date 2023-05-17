package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] words=scanner.nextLine().split("\\s+");
        double totalSum=0;
        for (int i = 0; i < words.length; i++) {
            String current=words[i];
            double sum1=0;
            char beforeNumber=current.charAt(0);
            char afterNumber=current.charAt(current.length()-1);
            int number=Integer.parseInt(current.substring(1,current.length()-1));
            if(Character.isLowerCase(beforeNumber)){
                sum1+=(number*(beforeNumber-96));
            }else if(Character.isUpperCase(beforeNumber)){
                sum1+=(number*1.0/(beforeNumber-64));
            }
            if(Character.isLowerCase(afterNumber)){
                sum1+=(afterNumber-96);
            }else if(Character.isUpperCase(afterNumber)){
                sum1-=(afterNumber-64);
            }
            totalSum+=sum1;
        }
        System.out.printf("%.2f",totalSum);
    }
}
