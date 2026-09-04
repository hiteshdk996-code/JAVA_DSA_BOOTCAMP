package DAY3.HW;
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    Employee employee;
    Department(Employee employee) {
        this.employee = employee;
    }

    void showEmployee() {
        System.out.println("Employee: " + employee.name);
    }
}


public class Aggregation {
    public static void main(String[] args) {
        Employee e = new Employee("John");
        Department d = new Department(e);
        d.showEmployee();
    }
}