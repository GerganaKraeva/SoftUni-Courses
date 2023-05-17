package TextProcessingMoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            int startNameIndex = line.indexOf("@");
            int endNameIndex = line.indexOf("|");
            int startAgeIndex = line.indexOf("#");
            int endAgeIndex = line.indexOf("*");
            String name = line.substring(startNameIndex + 1, endNameIndex);
            String age = line.substring(startAgeIndex + 1, endAgeIndex);
            System.out.printf("%s is %s years old.\n",name,age);
        }
    }
}
