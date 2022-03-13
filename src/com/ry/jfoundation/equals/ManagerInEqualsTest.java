package com.ry.jfoundation.equals;

import java.util.Objects;

public class ManagerInEqualsTest extends EmployeeInEqualsTest{
    private double bonus;

    public ManagerInEqualsTest(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)){
            return false;
        }
        var other = (ManagerInEqualsTest) otherObject;
        //super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }
    public int hashCode(){
        return java.util.Objects.hash(super.hashCode(), bonus);
    }
    public String toString(){
        return super.toString() + "[bonus=" + bonus + "]";
    }

    public double getBonus() {
        return bonus;
    }
}
