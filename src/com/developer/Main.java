package com.developer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) obj;

        // Only name is considered
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        // Only name is considered
        return Objects.hash(name);
    }
}

class Developer extends Employee {
    String tool;

    Developer(String name, int id, String tool) {
        super(name, id);
        this.tool = tool;
    }
    
    @Override
    public boolean equals(Object obj) {
        

        Developer other = (Developer) obj;

       
        return Objects.equals(name, other.name)
                && Objects.equals(tool, other.tool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tool);
    }

}

public class Main {
    public static void main(String[] args) {

        Set<Employee> employees = new HashSet<>();

        Developer d1 = new Developer("John", 101, "Java");
        Developer d2 = new Developer("John", 102, "Python");

        employees.add(d1);
        employees.add(d2);

        System.out.println(employees.size());
    }
}
