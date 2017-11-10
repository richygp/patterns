package net.i2cat.creational.prototype.test;

import net.i2cat.creational.prototype.Employees;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();

        List<String> list = employees1.getEmployees();
        list.add("John");
        List<String> list1 = employees2.getEmployees();
        list1.remove("Pankaj");

        System.out.println("employees List: " + employees.getEmployees());
        System.out.println("employees1 List: " + list);
        System.out.println("employees2 List: " + list1);
    }

}
