package FinalExam;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Map<String, List<String>> heroInfo = new LinkedHashMap<>();

        while (!userInput.equals("End")) {
            if (userInput.contains("Enroll")) {
                String name = userInput.split("\\s+")[1];
                if (heroInfo.containsKey(name)) {
                    System.out.printf("%s is already enrolled.\n", name);
                } else {
                    heroInfo.put(name, new ArrayList<>());
                }
            } else if (userInput.contains("Learn")) {
                String name = userInput.split("\\s+")[1];
                String spellName = userInput.split("\\s+")[2];
                if (!heroInfo.containsKey(name)) {
                    System.out.printf("%s doesn't exist.\n", name);
                } else {
                    if (heroInfo.get(name).contains(spellName)) {
                        System.out.printf("%s has already learnt %s.", name, spellName);
                    } else {
                        heroInfo.get(name).add(spellName);
                    }
                }
            } else if (userInput.contains("Unlearn")) {
                String name = userInput.split("\\s+")[1];
                String spellName = userInput.split("\\s+")[2];
                if (!heroInfo.containsKey(name)) {
                    System.out.printf("%s doesn't exist.\n", name);
                } else {
                    if (heroInfo.get(name).contains(spellName)) {
                        heroInfo.get(name).remove(spellName);
                    } else {
                        System.out.printf("%s doesn't know %s.\n", name, spellName);
                    }
                }
            }
            userInput = scanner.nextLine();
        }
        System.out.println("Heroes:");
        heroInfo.entrySet().forEach(entry -> {
            System.out.printf("== %s: \n",entry.getKey());
            System.out.print(String.join(", ",entry.getValue()));
        });
    }
}
