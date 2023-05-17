package MoreExamsFundamentals;

import java.util.*;

public class Task3PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plantInfo = new LinkedHashMap<>();
        Map<String, Integer> plantRarity = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("<->");
            String plant = data[0];
            int rarity = Integer.parseInt(data[1]);
            plantRarity.put(plant, rarity);
            plantInfo.put(plant,new ArrayList<>());
        }
        String nextInput = scanner.nextLine();

        while (!nextInput.equals("Exhibition")) {
            String[] newInfo = nextInput.split("\\s*\\-?\\s+");
            String plant = newInfo[1];
            if (nextInput.contains("Rate:")) {
                double rating = Double.parseDouble(newInfo[2]);
                if (plantInfo.containsKey(plant)) {
                    plantInfo.get(plant).add(rating);
                } else {
                    System.out.println("error");
                }
            } else if (nextInput.contains("Update:")) {
                int rarity = Integer.parseInt(newInfo[2]);
                if (plantRarity.containsKey(plant)) {
                    plantRarity.put(plant, rarity);
                } else {
                    System.out.println("error");
                }
            } else if (nextInput.contains("Reset")) {
                if (plantInfo.containsKey(plant)) {
                    plantInfo.put(plant, new ArrayList<>());
                } else {
                    System.out.println("error");
                }
            }
            nextInput = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Plants for the exhibition:");
        plantInfo.entrySet().forEach(entry -> {
                    double avrRating = 0;
                    int count = 0;
                    for (Double item : plantInfo.get(entry.getKey())) {
                        avrRating += item;
                        count++;
                    }
                    double result = avrRating / count;
                    if (avrRating == 0 && count == 0) {
                        result = 0;
                    }
                    System.out.printf("  - %s; Rarity: %d; Rating: %.2f\n", entry.getKey(), plantRarity.get(entry.getKey()), result);
                }
        );
    }
}