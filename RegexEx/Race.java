package RegexEx;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> personDistance = new LinkedHashMap<>();
        String secondInput = scanner.nextLine();
        while (!secondInput.equals("end of race")) {
            String name = secondInput.replaceAll("[\\W\\d]", "");
            int numbers = Integer.parseInt(secondInput.replaceAll("[\\WA-Za-z]", "").trim());
            int totalKm = 0;
            while (numbers > 0) {
                totalKm += numbers % 10;
                numbers = numbers / 10;
            }
            if (names.contains(name)) {
                if (!personDistance.containsKey(name)) {
                    personDistance.put(name, totalKm);
                } else {
                    int currentKm = personDistance.get(name);
                    personDistance.put(name, currentKm + totalKm);
                }
            }
            secondInput = scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            int index = i;
            if (index == 0) {
                System.out.printf("1st place: %s\n", names.get(index));
            } else if (index == 1) {
                System.out.printf("2nd place: %s\n", names.get(index));
            } else if (index == 2) {
                System.out.printf("3rd place: %s\n", names.get(index));
            }
        }
    }
}