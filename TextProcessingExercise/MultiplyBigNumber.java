package TextProcessingExercise;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int remainder=0;
        List<Integer> number=new ArrayList<>();
        String numberAsString="";

        for (int i = firstNumber.length()-1; i >=0; i--) {
            char symbol=firstNumber.charAt(i);
             numberAsString=""+symbol;
            int number1=Integer.parseInt(numberAsString);
            int result=number1*secondNumber;
            int total=result+remainder;
            int inList=total%10;
            remainder=total/10;
            number.add(inList);
        }
        if(remainder!=0) {
            number.add(remainder);
        }
        if(secondNumber!=0) {
            for (int i = number.size() - 1; i >= 0; i--) {
                int n = number.get(i);
                System.out.print(n);
            }
        }else{
            System.out.println(0);
        }


    }
}
