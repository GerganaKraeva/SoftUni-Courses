package ExamPrep2;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pieces = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\|");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];
            pieces.put(piece, new ArrayList<>());
            pieces.get(piece).add(0, composer);
            pieces.get(piece).add(1, key);

        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            if (input.contains("Add")) {
                String currentPiece = input.split("\\|")[1];
                String currentComposer = input.split("\\|")[2];
                String currentKey = input.split("\\|")[3];
                if (pieces.containsKey(currentPiece)) {
                    System.out.printf("%s is already in the collection!\n", currentPiece);
                } else {
                    pieces.put(currentPiece, new ArrayList<>());
                    pieces.get(currentPiece).add(0, currentComposer);
                    pieces.get(currentPiece).add(1, currentKey);
                    System.out.printf("%s by %s in %s added to the collection!\n", currentPiece, currentComposer, currentKey);
                }

            } else if (input.contains("Remove")) {
                String currentPiece = input.split("\\|")[1];
                if (pieces.containsKey(currentPiece)) {
                    pieces.remove(currentPiece);
                    System.out.printf("Successfully removed %s!\n", currentPiece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n", currentPiece);
                }
            } else if (input.contains("ChangeKey")) {
                String currentPiece = input.split("\\|")[1];
                String currentKey = input.split("\\|")[2];
                if (pieces.containsKey(currentPiece)) {
                    pieces.get(currentPiece).set(1, currentKey);
                    System.out.printf("Changed the key of %s to %s!\n", currentPiece, currentKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n", currentPiece);
                }

            }
            input = scanner.nextLine();
        }
        pieces.forEach((key, value) -> System.out.printf("%s -> Composer: %s, Key: %s%n", key, value.get(0), value.get(1)));
    }
}
