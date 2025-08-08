package CoreJava;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary(); 
}

class PermanentEmployee extends Employee {
    double salary;

    PermanentEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hours;

    ContractEmployee(String name, int id, double hourlyRate, int hours) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hours;
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee("Pkd", 21, 35000);
        ContractEmployee c = new ContractEmployee("Saswat", 22, 300, 40);

        System.out.println(p.calculateSalary());
        System.out.println(c.calculateSalary());
    }
}


