import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int number = Integer.parseInt(userInput);
        int forCheck = number;
        int n = 0;
        int sum = 1;
        int totalSum = 0;

        for (int i = userInput.length(); i > 0; i--) {
            n = forCheck % 10;
            forCheck = forCheck/10;
            for (int j = 1; j <= n; j++) {
                sum = sum*j;
            }
            totalSum +=sum;
            sum=1;
        }
        if (totalSum==number){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
