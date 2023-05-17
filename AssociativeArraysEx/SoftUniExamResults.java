package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> studentsPoints = new LinkedHashMap<>();
        Map<String, Integer> coursesSubmissions = new LinkedHashMap<>();
        String data = scanner.nextLine();
        while (!data.equals("exam finished")) {
            if (data.contains("-banned")) {
                String key = data.split("-")[0];
                studentsPoints.remove(key, studentsPoints.get(key));
            } else {
                String[] dataInput = data.split("-");
                String name = dataInput[0];
                String course = dataInput[1];
                int currentPoint = 0;
                int points = Integer.parseInt(dataInput[2]);
                if (!studentsPoints.containsKey(name)) {
                    studentsPoints.put(name, points);
                } else {
                    currentPoint = studentsPoints.get(name);
                    if (points > currentPoint) {
                        studentsPoints.put(name, points);
                    }
                }
                if (!coursesSubmissions.containsKey(course)) {
                    coursesSubmissions.put(course, 1);
                } else {
                    int currentNumber = coursesSubmissions.get(course);
                    coursesSubmissions.put(course, currentNumber + 1);
                }
            }
            data = scanner.nextLine();
        }
        System.out.println("Results:");
        studentsPoints.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " | " + entry.getValue())
        );
        System.out.println("Submissions:");
        coursesSubmissions.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " - " + entry.getValue())
        );
    }
}

