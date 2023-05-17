package AssociativeArraysEx;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> characterCount = new LinkedHashMap<>();
        //HashMap-Намаме конкретна потредба на маповете;
        //LinkedHashMap- записите се подреждат по ред на подаване;
        //ТрееМаp-записите се сортират по ключ

        for (Character symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if(characterCount.containsKey(symbol)){
                characterCount.put(symbol,characterCount.get(symbol)+1);
            }else{
                characterCount.put(symbol,1);
            }
        }
        characterCount.forEach((key,value)-> System.out.println(key+" -> "+value));

    }
}
