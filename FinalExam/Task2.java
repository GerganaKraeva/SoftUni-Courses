package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            String regex = "![A-Z][a-z]{2,}!:\\[[A-Za-z]{8,}\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String foundFromMatcher = matcher.group();
                if(foundFromMatcher.equals(line)){
                    int startIndex = foundFromMatcher.indexOf('[');
                    int endIndex = foundFromMatcher.indexOf(']');
                    int indexOfColon=foundFromMatcher.indexOf(':');
                    String found = matcher.group().substring(startIndex + 1, endIndex);
                    String word=line.substring(1,indexOfColon-1);

                    for (char symbol : found.toCharArray()) {
                        numbers.add(String.valueOf((int) symbol));
                    }
                    System.out.println(word+": " + String.join(" ", numbers));
                }
            }else{
                System.out.println("The message is invalid");
            }
        }
    }
}
