package com.tactfactory.poei.inherit.employees;

public class Worker extends Employee {

    public Worker() {
        this(null, null);
    }

    public Worker(String firstname, String lastname) {
        super(firstname, lastname, 1500.32f, null);
    }
}
