package MoreExamsFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String textAllPlaces=scanner.nextLine();
        String regex="([=\\/])[A-Z][A-Za-z]{2,}\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(textAllPlaces);
        List<String>destinations=new ArrayList<>();
        int travelPoints=0;
        while (matcher.find()){
            String fountDestination= matcher.group();
            String place=fountDestination.substring(1,fountDestination.length()-1);
            travelPoints+=place.length();
            destinations.add(place);
        }
        System.out.println("Destinations: "+String.join(", ",destinations));
        System.out.println("Travel Points: "+travelPoints);
    }
}
