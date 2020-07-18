package com.java.fundamentals.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// SELECT max(salary), employee_id, employee_name FROM Employee - Java
public class Employee {
    private Double salary;
    private String employeeId;
    private String employeeName;
    private String division;

    public Employee() {
    }

    public Employee(Double salary, String employeeId, String employeeName, String division) {
        this.salary = salary;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.division = division;
    }

    public static void sortNames(List<String> names) {
        Collections.sort(names);
    }

    public static void sortEmployeesByName(List<Employee> employees) {
        Collections.sort(employees, (e1, e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
        // Comparator also has a comparing method : Comparator.comparing(Employee::getEmployeeName)
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>() {
            {
                add(new Employee(1346.22, "1", "B", "Cards"));
                add(new Employee(1200.00, "2", "A", "Wealth"));
                add(new Employee(1000.00, "3", "F", "Treasury"));
                add(new Employee(15000.00, "4", "D", "Trade"));
            }
        };
        // Java 7 way
        Employee max = employees.get(0);
        for (Employee e : employees) {
            if (e.salary > max.salary)
                max = e;
        }

        // Java 8 way
        max = employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(max.getSalary() + " " + max.getEmployeeId() + " " + max.getEmployeeName());

        // Print employee names in sorted fashion
        List<String> employeeNames = employees.stream()
                .map(e -> e.getEmployeeName())  // Can also use stream sorted method after map to directly sort the elements of the stream
                .collect(Collectors.toList());
        System.out.println("Employee Names before sorting " + employeeNames);
        Employee.sortNames(employeeNames);
        System.out.println("Employee Names after sorting " + employeeNames);

        // 2nd way


    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}



