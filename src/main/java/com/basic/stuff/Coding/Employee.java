package com.basic.stuff.Coding;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sahilk on 15/01/17.
 */
public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) o;


        return this.name.equals(employee.name);

    }

    public boolean equals(Employee employee){

        if (this.id != employee.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = this.name.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Map<Employee, String> map =  new HashMap<>();
        map.put(new Employee("sahil", 1), "hello");
        map.put(new Employee("sahil", 2), "hello check");
        System.out.println(map.entrySet().toString());
    }
}
