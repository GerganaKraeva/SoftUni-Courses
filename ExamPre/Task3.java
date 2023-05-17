package ExamPre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regexDigit = "\\d+";
        Pattern patternDigit = Pattern.compile(regexDigit);
        Matcher matcherDigit = patternDigit.matcher(text);
        StringBuilder allDigit=new StringBuilder();
        long coolNum=1;
        while (matcherDigit.find()){
            allDigit.append(matcherDigit.group());
        }
        for (String item : allDigit.toString().split("")) {
            coolNum*=Integer.parseInt(item);
        }

        String regexWord = "(?<symbol>[:]{2}|[*]{2})[A-Z][a-z][a-z]+\\1";
        Pattern pattern = Pattern.compile(regexWord);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        List<String>result=new ArrayList<>();

        while (matcher.find()) {
            count++;
            String currentWord=matcher.group();
            int sumSymbols=0;
            for (char symbol : currentWord.toCharArray()) {
                if(symbol!='*'& symbol!=':'){
                    sumSymbols+=symbol;
                }
            }
            if(sumSymbols>coolNum){
                result.add(currentWord);
            }
        }
        System.out.printf("Cool threshold: %d\n",coolNum);
        System.out.printf("%d emojis found in the text. The cool ones are:\n",count);
        for (String s : result) {
            System.out.println(s);
        }

    }
}