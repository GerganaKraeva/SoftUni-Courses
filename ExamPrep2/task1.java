package ExamPrep2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String data = scanner.nextLine();
        StringBuilder result = new StringBuilder(line);

        while (!data.equals("Travel")) {
            String[] commands = data.split(":");
            if (data.contains("Add Stop")) {
                int index = Integer.parseInt(commands[1]);
                String text = commands[2];
                if (isValidIndex(index,result)) {
                    result.insert(index, text);
                }
            } else if (data.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);
                if (isValidIndex(startIndex,result) && isValidIndex(endIndex,result)) {
                    result.delete(startIndex, endIndex + 1);
                }

            } else if (data.contains("Switch")) {
                String oldText = commands[1];
                String newText = commands[2];
                String currentText = result.toString();
                if (currentText.contains(oldText)) {
                    currentText = currentText.replaceFirst(oldText, newText);
                }
                result = new StringBuilder(currentText);
            }
            System.out.println(result);
            data = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + result);
    }

    private static boolean isValidIndex(int index, StringBuilder builder) {
        if (index>=0 && index<builder.length()){
            return true;
        }
        return false;
    }
}
