import java.util.Random;
import java.util.Scanner;

public class GetRandomWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Ani", "Alex", "Gery", "Eli", "Ivan", "Peter", "Ivo"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas", "Blagoevgrag", "Sandanski"};
        String[] verbs = {"eats", "plays with", "holds", "brings", "sees", "reads"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bike", "book"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};

        System.out.println("Hello, this is your first random-generated sentence: ");

        do {
            String name = getRandomWords(names);
            String place = getRandomWords(places);
            String verb = getRandomWords(verbs);
            String noun = getRandomWords(nouns);
            String adverb = getRandomWords(adverbs);
            String detail = getRandomWords(details);
            System.out.printf("%s from %s %s %s %s %s\n", name, place, adverb, verb, noun, detail);
            System.out.println("Click [enter] to generate a new one.");
        }while (scanner.nextLine().length()==0);
    }

    public static String getRandomWords(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}
