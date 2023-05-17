package MoreExamsFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([|#])[A-Za-z ]+\\1(\\d{1,2}\\/\\d{2}\\/\\d{2})\\1\\d{1,4}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> food = new ArrayList<>();
        int totalNutrition=0;

        while (matcher.find()) {
            String current = matcher.group();
            String[] foundFood=current.split("[#|]");
            String toEat=foundFood[1];
            String date=foundFood[2];
            int nutrition=Integer.parseInt(foundFood[3]);
            totalNutrition+=nutrition;
            String result=String.format("Item: %s, Best before: %s, Nutrition: %d",toEat,date,nutrition);
            food.add(result);
        }
        System.out.printf("You have food to last you for: %d days!\n",totalNutrition/2000);
        food.forEach(System.out::println);
    }
}
