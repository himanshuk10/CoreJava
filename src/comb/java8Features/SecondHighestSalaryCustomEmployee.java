package comb.java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee{
    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}


public class SecondHighestSalaryCustomEmployee {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(50000, "Aman"));
        list.add(new Employee(55000, "Ravi"));
        list.add(new Employee(60000, "Neha"));
        list.add(new Employee(45000, "Raj"));
        list.add(new Employee(70000, "Priya"));
        list.add(new Employee(52000, "Arjun"));
        list.add(new Employee(48000, "Sneha"));
        list.add(new Employee(65000, "Ramesh"));
        list.add(new Employee(72000, "Anita"));
        list.add(new Employee(53000, "Vikas"));
        list.add(new Employee(47000, "Deepa"));
        list.add(new Employee(75000, "Sanjay"));
        list.add(new Employee(58000, "Pooja"));
        list.add(new Employee(49000, "Karan"));
        list.add(new Employee(80000, "Meena"));
        list.add(new Employee(62000, "Amit"));
        list.add(new Employee(68000, "Komal"));
        list.add(new Employee(55000, "Nikhil"));
        list.add(new Employee(51000, "Shreya"));
        list.add(new Employee(77000, "Manoj"));


        Optional<Employee> second = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(second);


    }
}

