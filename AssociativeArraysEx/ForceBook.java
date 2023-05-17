package AssociativeArraysEx;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String data=scanner.nextLine();
        Map<String, List<String>>forceUsers=new LinkedHashMap<>();
boolean isFound=false;
        while(!data.equals("Lumpawaroo")){
            String forceUser="";
            String forceSide="";
            if(data.contains("|")){
                forceSide=data.split(" \\| ")[0];
                forceUser=data.split(" \\| ")[1];
            }else if(data.contains(" -> ")){
                forceSide=data.split(" -> ")[1];
                forceUser=data.split(" -> ")[0];
                System.out.printf("%s joins the %s side!\n",forceUser,forceSide);
            }
            String finalForceUser=forceUser;
            forceUsers.entrySet().forEach(value->value.getValue().remove(finalForceUser));
            if(!forceUsers.containsKey(forceSide) ){
                forceUsers.put(forceSide,new ArrayList<>());
                forceUsers.get(forceSide).add(forceUser);
            }else {
                if(!forceUsers.get(forceSide).contains(forceUser)){
                    forceUsers.get(forceSide).add(forceUser);
                }
            }
            data=scanner.nextLine();
        }
        forceUsers.entrySet().stream().filter(entry->entry.getValue().size()>0).
                forEach(entry->{
            System.out.printf("Side: %s, Members: %d\n",entry.getKey(),entry.getValue().size());
            entry.getValue().forEach(forceUser-> System.out.printf("! %s\n",forceUser));
        });
    }
}
