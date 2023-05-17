package AssociativeArraysLab;

import java.text.Format;
import java.util.*;
import java.util.stream.Collectors;

public class oddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userInput = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        List<String> odd = new ArrayList<>();
        for (int i = 0; i < userInput.size(); i++) {
            String current = userInput.get(i).toLowerCase();

            if (wordsMap.containsKey(current)) {
                wordsMap.put(current, wordsMap.get(current) + 1);
            } else {
                wordsMap.put(current, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",odd));
    }
}
