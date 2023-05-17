package AssociativeArraysLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        TreeMap<Double,Integer> count=new TreeMap<>();

        for (Double number : numbers) {
            if(count.containsKey(number)){
                count.put(number, count.get(number)+1);
            }else {
                count.put(number, 1);
            }
        }
       for(Map.Entry<Double,Integer> entry:count.entrySet()) {
            DecimalFormat df=new DecimalFormat("#.######");
            System.out.printf("%S -> %d\n",df.format(entry.getKey()),entry.getValue());
        }
    }
}
