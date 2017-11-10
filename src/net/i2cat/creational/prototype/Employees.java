package net.i2cat.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public void loadData() {
        employees.add("Pankaj");
        employees.add("Raj");
        employees.add("David");
        employees.add("Lisa");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temporal = new ArrayList<>();
        temporal.addAll(this.getEmployees());
        return new Employees(temporal);
    }
}
