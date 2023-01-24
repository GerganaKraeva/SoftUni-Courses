import java.util.Scanner;

public class decryptingMessages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int key=Integer.parseInt(scanner.nextLine());
        int numberOfLines=Integer.parseInt(scanner.nextLine());
        String word="";

        for (int i = 1; i <=numberOfLines ; i++) {
            char symbol=scanner.nextLine().charAt(0);
            int newSymbol= (int)symbol + key;
            word += (char) newSymbol;
        }
        System.out.println(word);
    }
}
