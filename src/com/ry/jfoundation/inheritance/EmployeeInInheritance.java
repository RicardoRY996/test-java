package com.ry.jfoundation.inheritance;

import java.time.LocalDate;

public class EmployeeInInheritance {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public EmployeeInInheritance(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
