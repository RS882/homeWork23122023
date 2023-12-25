package Tree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "John0", 1200);
        Employee employee2 = new Employee("Jim", "Jim0", 1500);
        Employee employee3 = new Employee("Ivan", "Ivan0", 1770);
        Employee employee4 = new Employee("Mary", "Mary0", 2300,
                new Employee[]{employee3});
        Employee employee5 = new Employee("Lisa", "Lisa0", 4300,
                new Employee[]{employee1, employee2, employee4});

printEmployees(employee5,"");
        System.out.println(getEmployeeLastName(new Employee[]{employee1, employee2, employee3, employee4, employee5,
        }, "Jim0"));

        System.out.println(getEmployeeLastName(employee5,"Ivan0"));
        System.out.println(getSallaryAll(new Employee[]{employee1, employee2, employee3, employee4, employee5,
        }));
        System.out.println(getSallaryAll(employee5));
    }

    public static void printEmployees(Employee employee, String prefix) {
        String newprefix = String.format("%s -> %s %s", prefix, employee.firstName, employee.lastName);
        System.out.println(newprefix);
        for (Employee elem : employee.subemployee) {
            printEmployees(elem, newprefix);
        }
    }
    //   2 Напишите метод, который получает массив из Employee
//    (данный класс мы реализовали на занятии) и фамилию. Мнетод
//    должен вернуть объект Employee с сотрудником, у которого указанная фамилия.
    public static Employee getEmployeeLastName(Employee[] arr, String lastName) {
        for (Employee elem : arr) {
            if (elem.lastName.equals(lastName)) return elem;
        }
        return null;
    }

    public static Employee getEmployeeLastName(Employee empl, String lastName) {
        Employee res= null;
        if(empl.lastName.equals(lastName)) res= empl;
        else{
            for (Employee elem : empl.subemployee) {
               res= getEmployeeLastName(elem, lastName);
            }
        }
       return res;
    }
    //    3 Напишите метод, который получает массив из Employee (данный класс
//        мы реализовали на занятии) и возвращает сумму всех зарплат.
    public static double getSallaryAll(Employee[] arr) {
        double res =0;
        for (Employee elem : arr) {
            res+=elem.salary;
        }
    return res;
    }

    public static double getSallaryAll(Employee empl) {

        if(empl.subemployee.length==0) return  empl.salary;
       else {
            double res =empl.salary;
            for (Employee elem : empl.subemployee) {
                res = res +getSallaryAll(elem);
            }
            return res;
        }

    }

}

