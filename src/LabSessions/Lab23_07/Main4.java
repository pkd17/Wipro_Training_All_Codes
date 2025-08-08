package Lab23_07;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000.00;
    }
}

class HRManager extends Employee {
 
    void work() {
        System.out.println("HR Manager is managing recruitment");
    }

    void addEmployee() {
        System.out.println("New employee added to the company");
    }
}

public class Main4 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}
