package com.tactfactory.poei.inherit.employees;

import java.text.MessageFormat;

public class EmployeeProgram {
    public static void main(String[] args) {
        Company c = new Company("Armaque & Co");

        c.addEmployee(new Worker("Jean", "Peuplus"));
        c.addEmployee(new Executive("Bernard", "Arnaque", 10_432_103f));
        c.addEmployee(new Worker("Ives", "Descendant"));
        c.addEmployee(new Executive("Charles", "Azn"));

//        for (Employee e : c.getEmployees()) {
//            System.out.println(
//                    MessageFormat.format("{0} {1} gagne {2} € / mois", e.getFirstname(), e.getLastname(), e.getPay()));
//        }
        System.out.println(c);
    }

    private static void exemplePaie() {
        Employee e = new Executive();

        payer(e);

        payer(new Worker());
        payer(new Executive());
    }

    private static void payer(Employee e) {
        System.out.println("Virement de " + e.getPay() + " € vers le compte de " + e.getFirstname());
    }
}
