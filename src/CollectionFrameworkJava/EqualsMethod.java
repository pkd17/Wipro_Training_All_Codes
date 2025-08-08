package CollectionFrameworkJava;

import java.util.List;
import java.util.Objects;
import java.util.*;

public class EqualsMethod {
    int id;
    String name;

    EqualsMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EqualsMethod other = (EqualsMethod) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }

    public static void main(String[] args) {
        List<EqualsMethod> employees = new ArrayList<>();

        employees.add(new EqualsMethod(103, "Ravi"));
        employees.add(new EqualsMethod(101, "Amit"));
        employees.add(new EqualsMethod(102, "Zara"));
        employees.add(new EqualsMethod(102, "Zara"));  
        employees.add(new EqualsMethod(104, "John"));
        employees.add(new EqualsMethod(103, "Ravi"));

        System.out.println("All Employees:");
        for (EqualsMethod e : employees) {
            System.out.println(e);
        }

        Set<EqualsMethod> unique = new HashSet<>(employees);

        System.out.println("\nUnique Employees:");
        for (EqualsMethod e : unique) {
            System.out.println(e);
        }
    }
}

