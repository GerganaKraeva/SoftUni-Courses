package MoreExamsFundamentals;

import java.util.*;

public class Problem3HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesInfo = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");
            String name = data[0];
            int hitPoints = Integer.parseInt(data[1]);
            int mamaPoints = Integer.parseInt(data[2]);
            if (hitPoints <= 100 && mamaPoints <= 200 && !heroesInfo.containsKey(name)) {
                heroesInfo.putIfAbsent(name, new ArrayList<>());
                heroesInfo.get(name).add(0, hitPoints);
                heroesInfo.get(name).add(1, mamaPoints);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s+-\\s+");
            if (input.contains("CastSpell")) {
                String name = commands[1];
                int mamaPoints = Integer.parseInt(commands[2]);
                String spellName = commands[3];
                if (mamaPoints <= heroesInfo.get(name).get(1)) {
                    int currentMamaPoints = heroesInfo.get(name).get(1);
                    heroesInfo.get(name).set(1, currentMamaPoints - mamaPoints);
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n", name, spellName, heroesInfo.get(name).get(1));
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!\n", name, spellName);
                }
            } else if (input.contains("TakeDamage")) {
                String name = commands[1];
                int damage = Integer.parseInt(commands[2]);
                String attacker = commands[3];
                int currentHp = heroesInfo.get(name).get(0);
                int finalHp = currentHp - damage;
                if (finalHp > 0) {
                    heroesInfo.get(name).set(0,finalHp);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", name, damage, attacker, finalHp);
                } else {
                    heroesInfo.remove(name);
                    System.out.printf("%s has been killed by %s!\n", name, attacker);
                }

            } else if (input.contains("Recharge")) {
                String name = commands[1];
                int amount = Integer.parseInt(commands[2]);
                int currentMp = heroesInfo.get(name).get(1);
                int finalMp = currentMp + amount;
                if (finalMp > 200) {
                    finalMp = 200;
                }
                heroesInfo.get(name).set(1,finalMp);
                System.out.printf("%s recharged for %d MP!\n", name, finalMp - currentMp);
            } else if (input.contains("Heal")) {
                String name = commands[1];
                int amount = Integer.parseInt(commands[2]);
                int currentHp = heroesInfo.get(name).get(0);
                int finalHp = currentHp + amount;
                if (finalHp > 100) {
                    finalHp = 100;
                }
                heroesInfo.get(name).set(0,finalHp);
                System.out.printf("%s healed for %d HP!\n", name, finalHp - currentHp);
            }
            input = scanner.nextLine();
        }
        heroesInfo.entrySet().forEach(entry -> {
            System.out.printf("%s\n", entry.getKey());
            System.out.printf("  HP: %d\n", entry.getValue().get(0));
            System.out.printf("  MP: %d\n", entry.getValue().get(1));
        });
    }
}
