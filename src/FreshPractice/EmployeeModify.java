package FreshPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeModify {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(1, "Arjun", 23, 20000);
        Employee e2 = new Employee(2, "Bhanu", 24, 23000);
        Employee e3 = new Employee(3, "Chandu", 27, 20200);
        Employee e4 = new Employee(4, "Dhanush", 26, 40000);
        Employee e5 = new Employee(5, "Eshwar", 25, 36660);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        List<Employee> modifiedList = employeeList.stream().map(e -> {
            if (e.getAge() > 25) {
                e.setSalary(e.getSalary() * 2);
            }
            return e;
        }).filter(e -> e.getAge() > 25).collect(Collectors.toList());
        System.out.println(modifiedList);

    }
}
