package MoreExamsFundamentals;

import java.util.Scanner;

public class Task1SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();
        String instruction1 = scanner.nextLine();

        while (!instruction1.equals("Reveal")) {
            String[] instructions = instruction1.split("\\:\\|\\:");
            if (instructions[0].equals("InsertSpace")) {
                int index = Integer.parseInt(instructions[1]);
                StringBuilder result = new StringBuilder(concealedMessage);
                result.insert(index, " ");
                concealedMessage=result.toString();
            } else if (instructions[0].equals("Reverse")) {
                String substring = instructions[1];
                if(concealedMessage.contains(substring)){
                    concealedMessage= concealedMessage.replaceFirst(substring, "");
                    StringBuilder toAdd = new StringBuilder();
                    for (int i = substring.length() - 1; i >= 0; i--) {
                        toAdd.append(substring.charAt(i));
                    }
                    concealedMessage = concealedMessage+toAdd.toString();

                } else {
                    System.out.println("error");
                }
            } else if (instructions[0].equals("ChangeAll")) {
                String substring = instructions[1];
                String replacement = instructions[2];
                concealedMessage= concealedMessage.replaceAll(substring, replacement);
            }
            System.out.println(concealedMessage);
            instruction1 = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s\n", concealedMessage);
    }
}