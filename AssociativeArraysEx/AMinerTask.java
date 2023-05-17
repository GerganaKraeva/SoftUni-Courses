package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userInput=scanner.nextLine();
        Map<String ,Integer>resource=new LinkedHashMap<>();

        while(!userInput.equals("stop")){
            String res=userInput;
            int quantity=Integer.parseInt(scanner.nextLine());
            if(resource.containsKey(res)){
                resource.put(res,quantity+resource.get(res));
            }else {
                resource.put(res, quantity);
            }
            userInput=scanner.nextLine();
        }
        resource.forEach((res,quantity)-> System.out.println(res+" -> " +quantity));
    }
}
