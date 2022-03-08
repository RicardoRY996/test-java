package com.ry.jfoundation.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeInCloneTest implements Cloneable {
    private Date hireDay;
    private double salary;
    private String name;

    public EmployeeInCloneTest(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public EmployeeInCloneTest clone() throws CloneNotSupportedException {
        //call Object.clone
        EmployeeInCloneTest cloned = (EmployeeInCloneTest) super.clone();

        //clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year, int month, int day){
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        //example of instance field mutation
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + " ,salary=" + salary + " ,hireDay=" + hireDay + "]";
    }
}
