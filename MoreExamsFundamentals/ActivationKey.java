package MoreExamsFundamentals;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();
        String commands = scanner.nextLine();

        while ((!commands.equals("Generate"))) {
            if (commands.contains("Contains")) {
                String substring=commands.split(">>>")[1];
                if(rawActivationKey.contains(substring)){
                    System.out.printf("%s contains %s\n",rawActivationKey,substring);
                }else{
                    System.out.println("Substring not found!");
                }

            } else if (commands.contains("Flip")) {
                String upperOrLower=commands.split(">>>")[1];
                int startIndex=Integer.parseInt(commands.split(">>>")[2]);
                int endIndex=Integer.parseInt(commands.split(">>>")[3]);
                String chancedSubstring=rawActivationKey.substring(startIndex,endIndex);
                if(upperOrLower.equals("Upper")){
                    chancedSubstring=chancedSubstring.toUpperCase();
                }else if(upperOrLower.equals("Lower")){
                    chancedSubstring=chancedSubstring.toLowerCase();
                }

                rawActivationKey=rawActivationKey.substring(0,startIndex)+chancedSubstring+rawActivationKey.substring(endIndex);
                System.out.println(rawActivationKey);
            } else if (commands.contains("Slice")) {
                int startIndex=Integer.parseInt(commands.split(">>>")[1]);
                int endIndex=Integer.parseInt(commands.split(">>>")[2]);
                StringBuilder changed=new StringBuilder(rawActivationKey);
                changed.delete(startIndex,endIndex);
                rawActivationKey=changed.toString();
                System.out.println(rawActivationKey);
            }
            commands = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s\n",rawActivationKey );


    }


}
