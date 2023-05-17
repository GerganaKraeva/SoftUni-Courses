package MoreExamsFundamentals;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] data = input.split("\\s+");
            if (input.equals("TakeOdd")) {
                StringBuilder result = new StringBuilder();
                for (int i = 1; i < line.length(); i += 2) {
                    result.append(line.charAt(i));
                }
                line=result.toString();
                System.out.println(line);
            } else if (input.contains("Cut")) {
                int index = Integer.parseInt(data[1]);
                int length = Integer.parseInt(data[2]);
                StringBuilder result = new StringBuilder(line);
                result.delete(index, index + length);
                line=result.toString();
                System.out.println(line);
            } else if (input.contains("Substitute")) {
                String substring = data[1];
                String substitute = data[2];
                if (line.contains(substring)) {
                    line=line.replace(substring, substitute);
                    System.out.println(line);
                }else{
                    System.out.println("Nothing to replace!");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Your password is: "+line);
    }
}
