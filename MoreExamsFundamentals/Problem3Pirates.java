package MoreExamsFundamentals;

import java.util.*;

public class Problem3Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Map<String, List<Integer>> pirates = new LinkedHashMap<>();

        while (!userInput.equals("Sail")) {
            String[] piratesInfo = userInput.split("\\|\\|");
            String city = piratesInfo[0];
            int population = Integer.parseInt(piratesInfo[1]);
            int gold = Integer.parseInt(piratesInfo[2]);

            if (!pirates.containsKey(city)) {
                pirates.put(city, new ArrayList<>());
                pirates.get(city).add(0, population);
                pirates.get(city).add(1, gold);
            } else {
                int currentPopulation = pirates.get(city).get(0);
                int currentGold = pirates.get(city).get(1);
                pirates.get(city).set(0, currentPopulation + population);
                pirates.get(city).set(1, currentGold + gold);
            }
            userInput = scanner.nextLine();
        }

        String events = scanner.nextLine();
        while (!events.equals("End")) {
            if (events.contains("Plunder")) {
                String town = events.split("=>")[1];
                int people = Integer.parseInt(events.split("=>")[2]);
                int gold = Integer.parseInt(events.split("=>")[3]);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);
                int currentPopulation = pirates.get(town).get(0);
                int currentGold = pirates.get(town).get(1);
                pirates.get(town).set(0, currentPopulation - people);
                pirates.get(town).set(1, currentGold - gold);
                if (pirates.get(town).get(0) == 0 || pirates.get(town).get(1) == 0 || pirates.get(town).get(0) == 0 && pirates.get(town).get(1) == 0) {
                    pirates.remove(town);
                    System.out.printf("%s has been wiped off the map!\n", town);
                }
            } else if (events.contains("Prosper")) {
                String town = events.split("=>")[1];
                String goldAsString = events.split("=>")[2];
                int gold = Integer.parseInt(goldAsString);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");

                } else {
                    pirates.get(town).set(1, pirates.get(town).get(1) + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, town, pirates.get(town).get(1));
                }
            }
            events = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", pirates.size());
        pirates.entrySet().

                forEach(entry ->
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", entry.getKey(), entry.getValue().

                                get(0), entry.

                                getValue().

                                get(1)));
    }
}
