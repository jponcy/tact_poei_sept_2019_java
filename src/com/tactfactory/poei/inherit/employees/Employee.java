package com.tactfactory.poei.inherit.employees;

import java.text.MessageFormat;
import java.time.LocalDate;

public abstract class Employee {

    private String firstname;

    private String lastname;

    private LocalDate birthdate;

    private float pay;

    public Employee(String firstname, String lastname, float pay, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pay = pay;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %,.2f € / mois", this.getFirstname(), this.getLastname(), this.getPay());
//        return MessageFormat.format("{0} {1} {2} € / mois", this.getFirstname(), this.getLastname(), this.getPay());
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the birthdate
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the pay
     */
    public float getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(float pay) {
        this.pay = pay;
    }
}
