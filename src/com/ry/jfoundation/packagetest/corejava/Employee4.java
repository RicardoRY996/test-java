package com.ry.jfoundation.packagetest.corejava;

import java.time.LocalDate;

public class Employee4 {
    private String name;
    private double salay;
    private LocalDate hireDay;

    public Employee4(String name, double salay, int year, int month, int day){
        this.name = name;
        this.salay = salay;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalay() {
        return salay;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salay * byPercent / 100;
        salay = salay + raise;
    }
}
