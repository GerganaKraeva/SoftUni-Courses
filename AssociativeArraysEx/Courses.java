package AssociativeArraysEx;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, ArrayList<String>> courseAndStudents = new LinkedHashMap<>();


        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String nameOfStudent = command.split(" : ")[1];

            if (!courseAndStudents.containsKey(courseName)) {
                courseAndStudents.put(courseName, new ArrayList<>());
            }
            courseAndStudents.get(courseName).add(nameOfStudent);
            command = scanner.nextLine();
        }
        courseAndStudents.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(nameOfStudent -> System.out.println("-- " + nameOfStudent));
        });
    }
}

