//package ObjectsAndClassesMoreEx;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        List<Employee> listEmp = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            String line = scanner.nextLine();
//            String[] info = line.split(" ");
//            String name = info[0];
//            double salary = Double.parseDouble(info[1]);
//            String position = info[2];
//            String department = info[3];
//            String email = "";
//            int age = 0;
//            if (info.length == 6) {
//                email = info[4];
//                age = Integer.parseInt(info[5]);
//            } else if (info.length == 5) {
//                if (info[4].contains("@")) {
//                    email = info[4];
//                    age = -1;
//                } else {
//                    age = Integer.parseInt(info[4]);
//                    email = "n/a";
//                }
//            }
//            Employee employee = new Employee(name, salary, position, department, email, age);
//            listEmp.add(employee);
//        }
//        System.out.println();
//
//        List<Department> avrSalary = new ArrayList<>();
//        for (Employee employee : listEmp) {
//            String department = employee.getDepartment();
//            Department dep = new Department(department, new ArrayList<>());
//            double salary = employee.getSalary();
//            if (!avrSalary.containsKey(department)) {
//                avrSalary.put(department, new ArrayList<>());
//            }
//            avrSalary.get(department).add(salary);
//        }
//
//    }
//
//
//}
//
//