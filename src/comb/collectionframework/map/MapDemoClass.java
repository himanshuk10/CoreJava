package comb.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

// Define the class to hold data
class Employee {
    int id;
    String department;
    double salary;
    String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Name: " + name + ", Dept: " + department + ", Salary: ₹" + salary;
    }
}


public class MapDemoClass {
    public static void main(String[] args) {
        Employee employee1 =  new Employee("Aman",101, "IT", 75000);
        Employee employee2 =  new Employee("Himanshu",102, "HR", 50000);
        Employee employee3 =  new Employee("John",103, "FMG", 65000);
        Employee employee4 =  new Employee("Lobby",101, "Dev", 55000);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(employee1.getId(), employee1);
        employeeMap.put(employee2.getId(), employee2);
        employeeMap.put(employee3.getId(), employee3);
        employeeMap.put(employee4.getId(), employee4);

        System.out.println(employeeMap);

    }
}
