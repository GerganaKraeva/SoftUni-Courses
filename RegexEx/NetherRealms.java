package RegexEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String[] input = line1.split(",\\s+");
        String regexHealth = "[A-Za-z^,^ ]+";
        Pattern patternHealth = Pattern.compile(regexHealth);


        for (int j = 0; j < input.length; j++) {
            String line = input[j];
            Matcher health = patternHealth.matcher(line);
            String regexDamage = "[0-9\\.\\-\\+]+";
            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher damage = patternDamage.matcher(line);
            int sum = 0;
            double damageSum = 0;
            StringBuilder word = new StringBuilder();

            while (health.find()) {
                String symbol = health.group();
                word.append(symbol);
            }
            for (int i = 0; i < word.length(); i++) {
                char current = word.charAt(i);
                sum += current;
            }
            while (damage.find()) {
                String symbol = damage.group();
                damageSum += Double.parseDouble(symbol);
            }

            for (char item : line.toCharArray()) {
                if (item == '/') {
                    damageSum /= 2;
                } else if (item == '*') {
                    damageSum *= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage\n", line, sum, damageSum);
        }
    }
}
