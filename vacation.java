import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice =0;


        switch (day) {
            case ("Friday"):
                if (typeOfGroup.equals("Students")) {
                    price = 8.45;
                }
                if (typeOfGroup.equals("Business")) {
                    price = 10.90;
                }
                if (typeOfGroup.equals("Regular")) {
                    price = 15;
                }
                break;
            case ("Saturday"):
                if (typeOfGroup.equals("Students")) {
                    price = 9.80;
                }
                if (typeOfGroup.equals("Business")) {
                    price = 15.6;
                }
                if (typeOfGroup.equals("Regular")) {
                    price = 20;
                }
                break;
            case ("Sunday"):
                if (typeOfGroup.equals("Students")) {
                    price = 10.46;
                }
                if (typeOfGroup.equals("Business")) {
                    price = 16;
                }
                if (typeOfGroup.equals("Regular")) {
                    price = 225;
                }
                break;
        }

        switch (typeOfGroup) {
            case ("Students"):
                if (numberOfGroup >=30){
                    totalPrice = 0.85*price*numberOfGroup;
                }else{
                    totalPrice = price*numberOfGroup;
                }
                break;
            case ("Business"):
                if (numberOfGroup >=100){
                    totalPrice = price*(numberOfGroup-10);
                }else{
                    totalPrice = price*numberOfGroup;
                }
                break;
            case ("Regular"):
                if (numberOfGroup >=10 && numberOfGroup<=20){
                    totalPrice = 0.95*price*numberOfGroup;
                }else{
                    totalPrice = price*numberOfGroup;
                }
                break;
        }
        System.out.printf("Total price: %.2f",totalPrice);

    }
}
