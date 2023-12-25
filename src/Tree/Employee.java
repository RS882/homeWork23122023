package Tree;

import java.util.Arrays;

public class Employee {
    public String firstName;
    public String lastName;
    public double salary;
    public Employee[] subemployee;

    public Employee(String firstName, String lastName, double salary, Employee[] employee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.subemployee = employee;
    }

    public Employee(String firstName, String lastName, double salary){
        this(firstName, lastName, salary, new Employee[]{});
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +

                '}';
    }
}

