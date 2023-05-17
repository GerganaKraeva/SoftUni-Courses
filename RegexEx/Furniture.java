package RegexEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Z]+[a-z]*)<<(?<price>\\d+[.\\d+]*)!(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;
        List<String> boughtFurniture = new ArrayList<>();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));
                totalSum += price * count;
                boughtFurniture.add(furniture);
            }
            input=scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String item : boughtFurniture) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
