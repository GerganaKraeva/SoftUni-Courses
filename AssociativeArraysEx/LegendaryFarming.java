package AssociativeArraysEx;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new LinkedHashMap<>();
        //спираме ако спечелим; продължаваме ако не сме;
        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");
            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentMaterial = materials.get(material);
                    materials.put(material, currentMaterial + quantity);
                } else {
                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);
                    } else {
                        int currentJunks = junks.get(material);
                        junks.put(material, currentJunks + quantity);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        //всички валиди материали;
        //entry материал (key)-количество(value);
        materials.entrySet().forEach(entry-> System.out.println(entry.getKey()+": "+entry.getValue()));
        //всички боклуци;
        junks.entrySet().forEach(entry-> System.out.println(entry.getKey()+": "+entry.getValue()));

    }
}
