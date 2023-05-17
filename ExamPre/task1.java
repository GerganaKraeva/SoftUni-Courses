package ExamPre;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        StringBuilder modifyMessage = new StringBuilder(message);
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] toDo = command.split("\\|");
            String movement = toDo[0];
            if (movement.equals("Move")) {
                int numbersOfLetters = Integer.parseInt(toDo[1]);
                String firstLetters = message.substring(0, numbersOfLetters);
                modifyMessage.replace(0, numbersOfLetters, firstLetters);
                modifyMessage.append(firstLetters);
            } else if (movement.equals("Insert")) {
                int index = Integer.parseInt(toDo[1]);
                String value = toDo[2];
                modifyMessage.insert(index, value);
            } else if (movement.equals("ChangeAll")) {
                String toChange = toDo[1];
                String replacement = toDo[2];
                String currentMessage=modifyMessage.toString();
                 currentMessage=currentMessage.replaceAll(toChange,replacement);
                 modifyMessage=new StringBuilder(currentMessage);
            }
            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", modifyMessage.toString());
    }
}
