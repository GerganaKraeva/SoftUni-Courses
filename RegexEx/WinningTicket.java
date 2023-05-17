package RegexEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s*\\,\\s*")).collect(Collectors.toList());
        String regex = "[$@#\\^]{6,10}";
        Pattern pattern = Pattern.compile(regex);
        for (String item : input) {
            Matcher matcher = pattern.matcher(item);

            if (item.length() > 20 ||item.length()<12) {
                System.out.println("invalid ticket");
            } else {
                int count=0;
                String first="";
                String second="";
                while(matcher.find()){
                    if (count==0){
                        first=matcher.group();
                    }else if(count==1){
                        second=matcher.group();
                    }
                    count++;
                }

                if (count==2 & first.equals(second) ) {

                    if (first.length() < 10) {
                        System.out.printf("ticket \"%s\" - %d%c\n", item, first.length(), first.charAt(0));
                    } else if (first.length() == 10) {
                        System.out.printf("ticket \"%s\" - %d%c Jackpot!\n", item, first.length(), first.charAt(0));
                    }
                } else{
                    System.out.printf("ticket \"%s\" - no match\n ",item);

                }
            }
        }
    }
}