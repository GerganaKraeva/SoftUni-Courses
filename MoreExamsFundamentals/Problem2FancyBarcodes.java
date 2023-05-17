package MoreExamsFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";


        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            String barcode = "00";
            if (matcher.find()) {
                String found = matcher.group();
                StringBuilder currentBarcode=new StringBuilder();
                for (char item : found.toCharArray()) {
                    if(Character.isDigit(item)){
                        barcode="";
                        currentBarcode.append(item);
                    }
                }
                if(!currentBarcode.toString().equals("")){
                    barcode=currentBarcode.toString();
                }
                System.out.println("Product group: "+barcode);
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
