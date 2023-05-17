package RegexEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String regex="(?<user>[0-9A-Za-z]+[\\.\\_\\-]?[0-9A-Za-z]+)@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
