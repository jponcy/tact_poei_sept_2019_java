package com.tactfactory.poei.inherit.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;

    private final List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this(name, null);
    }

    public Company(String name, List<Employee> employees) {
        this.name = name;

        if (employees != null) {
            this.employees.addAll(employees);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb
            .append(this.getName())
            .append(" a ")
            .append(this.getEmployees().size())
            .append(" employé");

        if (this.getEmployees().size() > 1) {
            sb.append('s');
        }

        sb.append(" :\n");

        for (Employee e : this.getEmployees()) {
            sb.append("- ");
            sb.append(e);
            sb.append('\n');
        }

        return sb.toString();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

//    /**
//     * @param employees the employees to set
//     */
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }
}
