import java.util.Scanner;

public class townInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int population=Integer.parseInt(scanner.nextLine());
        short area =Short.parseShort(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",townName,population,area);
    }
}
