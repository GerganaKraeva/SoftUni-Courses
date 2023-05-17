package FinalExam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            if (commands.contains("Translate")) {
                String symbolToReplace = commands.split("\\s+")[1];
                String replacement = commands.split("\\s+")[2];
                line = line.replace(symbolToReplace, replacement);
                System.out.println(line);
            } else if (commands.contains("Includes")) {
                String substring = commands.split("\\s+")[1];
                if (line.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (commands.contains("Start")) {
                String substring = commands.split("\\s+")[1];
                if (line.startsWith(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (commands.equals("Lowercase")) {
                line = line.toLowerCase();
                System.out.println(line);
            } else if (commands.contains("FindIndex")) {
                String lastIndex = commands.split("\\s+")[1];
                int value = line.lastIndexOf(lastIndex);
                System.out.println(value);
            } else if (commands.contains("Remove")) {
                int startIndex = Integer.parseInt(commands.split("\\s+")[1]);
                int count = Integer.parseInt(commands.split("\\s+")[2]);
                StringBuilder deletedLetters = new StringBuilder(line);
                deletedLetters.delete(startIndex, startIndex + count);
                line = deletedLetters.toString();
                System.out.println(line);
            }
            commands = scanner.nextLine();
        }
    }
}
