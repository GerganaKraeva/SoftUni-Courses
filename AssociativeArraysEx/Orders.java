package AssociativeArraysEx;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String product = data.split("\\s+")[0];
            double price = Double.parseDouble(data.split("\\s+")[1]);
            int quantity = Integer.parseInt(data.split("\\s+")[2]);

            if (!productQuantity.containsKey(product)) {
                productQuantity.put(product, quantity);
            } else {
                int currentQuantity = productQuantity.get(product);
                productQuantity.put(product, currentQuantity + quantity);
            }
            productPrice.put(product, price);

            data = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            String productName = entry.getKey();
            double finalSum = productQuantity.get(productName) * productPrice.get(productName);
            System.out.printf("%s -> %.2f%n",productName,finalSum);
        }
    }
    //продукт и колко е платено за него(количество по цена);
}

