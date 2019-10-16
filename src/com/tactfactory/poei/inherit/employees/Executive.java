package com.tactfactory.poei.inherit.employees;

public class Executive extends Employee {

    public Executive() {
        this(null, null);
        // this.setPay(2000.15f); // Autre solution.
    }

    public Executive(String firstname, String lastname) {
        this(firstname, lastname, 2000.15f);
    }

    public Executive(String firstname, String lastname, float pay) {
        super(firstname, lastname, pay, null);
    }

//    @Override
//    public float getPay() {
//        Float result = super.getPay(); // pay devrait être définit en Float dans Employee
//
//        if (result == null) {
//            result = 2000.15f;
//        }
//
//        return result;
//    }
}
