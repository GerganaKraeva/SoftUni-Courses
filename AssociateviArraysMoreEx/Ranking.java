package AssociateviArraysMoreEx;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, String> contestPassword = new LinkedHashMap<>();
        while (!line.equals("end of contests")) {
            String[] contestInfo = line.split(":");
            String contest = contestInfo[0];
            String password = contestInfo[1];
            if (!contestPassword.containsKey(contest)) {
                contestPassword.put(contest, password);
            }
            line = scanner.nextLine();
        }
        String userInput = scanner.nextLine();
        Map<String, List<String>> nameUser = new LinkedHashMap<>();
        Map<String, List<Integer>> pointUser = new LinkedHashMap<>();
        while (!userInput.equals("end of submissions")) {
            String[] newInfo = userInput.split("=>");
            String contestName = newInfo[0];
            String password = newInfo[1];
            String userName1 = newInfo[2];
            int points = Integer.parseInt(newInfo[3]);

            if (contestPassword.containsKey(contestName) && contestPassword.get(contestName).equals(password)) {
                if(!nameUser.containsKey(contestName)) {
                    nameUser.put(contestName, new ArrayList<>());
                }
                nameUser.get(contestName).add(userName1);
                if(!pointUser.containsKey(userName1)) {
                    pointUser.put(userName1, new ArrayList<>());
                }
                pointUser.get(userName1).add(points);
            }
            System.out.println();
            userInput = scanner.nextLine();
        }

        Map<String, Integer> totalResult = new TreeMap<>();
        for (Map.Entry<String, List<Integer>> entry : pointUser.entrySet()) {
            int sum1=getSumList(entry.getValue());
            totalResult.put(userInput,sum1);
            }
        System.out.println();
        }


    private static int getSumList(List<Integer>points) {
        int totalSum=0;
        for (Integer point : points) {
            totalSum+=point;
        }
        return totalSum;
    }

}
