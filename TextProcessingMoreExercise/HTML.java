package TextProcessingMoreExercise;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String titleOfArticle=scanner.nextLine();
        System.out.printf("<h1>\n   %s\n</h1>\n",titleOfArticle);
        String content=scanner.nextLine();
        System.out.printf("<article>\n   %s\n</article>\n",content);
        String comments=scanner.nextLine();


        while(!comments.equals("end of comments")){
            System.out.printf("<div>\n   %s\n</div>\n",comments);
            comments=scanner.nextLine();
        }
    }
}
