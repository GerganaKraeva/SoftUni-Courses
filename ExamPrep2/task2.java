package ExamPrep2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(\\@([A-Za-z]{3,})\\@){2}|(\\#([A-Za-z]{3,})\\#){2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        boolean isValidWord=false;
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            count++;
            String found = matcher.group();
            String first = found.substring(1, (found.length() / 2) - 1);
            String second = found.substring((found.length() / 2) + 1, found.length() - 1);
            StringBuilder reversed = new StringBuilder();
            for (int i = second.length() - 1; i >= 0; i--) {
                reversed.append(second.charAt(i));
            }
            if (reversed.toString().equals(first)) {
                isValidWord=true;
                String one = (first + " <=> " + second);
                result.add(one);
            }

        }
        if (count == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            if (isValidWord) {
                System.out.printf("%d word pairs found!\n", count);
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", result));
            }else{
                System.out.printf("%d word pairs found!\n", count);
                System.out.println("No mirror words!");
            }
        }
    }

}
