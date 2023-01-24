import java.util.Scanner;

public class reversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--) {
            char letter = input.charAt(i);
            reverse += letter;
        }
        System.out.println(reverse);
    }
}
