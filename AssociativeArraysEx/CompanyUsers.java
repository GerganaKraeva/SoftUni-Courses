package AssociativeArraysEx;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<String>>companyUsers=new LinkedHashMap<>();
        String data=scanner.nextLine();

        while(!data.equals("End")){
            String[]userData=data.split(" -> ");
            String company=userData[0];
            String id=userData[1];
            if(!companyUsers.containsKey(company)){
                companyUsers.put(company,new ArrayList<>());
                companyUsers.get(company).add(id);
            }else{
                if(!companyUsers.get(company).contains(id)){
                    companyUsers.get(company).add(id);
                }
            }
            data=scanner.nextLine();
        }
        companyUsers.entrySet().forEach(entry->{ System.out.printf("%s\n",entry.getKey());
        entry.getValue().forEach(id-> System.out.printf("-- %s\n",id));
        });
    }
}
