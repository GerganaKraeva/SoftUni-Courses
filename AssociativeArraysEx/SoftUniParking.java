package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[1];
            if (command.split(" ")[0].equals("register")) {
                String number = command.split(" ")[2];
                if (parkingLot.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s\n", parkingLot.get(name));
                } else {
                    parkingLot.put(name, number);
                    System.out.printf("%s registered %s successfully\n", name, number);
                }
            }
            if (command.split(" ")[0].equals("unregister")) {
                if (parkingLot.containsKey(name)) {
                    parkingLot.remove(name);
                    System.out.printf("%s unregistered successfully\n", name);
                } else {
                    System.out.printf("ERROR: user %s not found\n", name);
                }
            }
        }
        parkingLot.forEach((name,number)-> System.out.println(name+" => "+number));
    }
}
