package ObjectsAndClassesMoreEx;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;


    public Employee(String name, double salary,String position, String department, String email, int age){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;
        this.email=email;
        this.age=age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
