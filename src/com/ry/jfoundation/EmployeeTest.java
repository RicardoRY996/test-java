package com.ry.jfoundation;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        Employee1[] staff = new Employee1[3];

        staff[0] = new Employee1("Ry", 75000, 1987, 12, 15);
        staff[1] = new Employee1("ll", 50000, 1989, 10, 1);
        staff[2] = new Employee1("hh", 40000, 1990, 3, 15);

        //raise everyone's salary by 5%
        for (Employee1 e : staff)
            e.raiseSalary(5);

        //print out about all object
        for (Employee1 e : staff)
            System.out.println("name=" + e.getName() + " salary=" + e.getSalary() + " hireDay=" + e.getHireDay());
//            e.toString();
    }
}
class Employee1 {
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee1(String name, double salary, int year, int month, int day){
            this.name = name;
            this.salary = salary;
            this.hireDay = LocalDate.of(year,month,day);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void setHireDay(LocalDate hireDay) {
            this.hireDay = hireDay;
        }
        public void raiseSalary(double byPercent){
            double raise = salary * byPercent / 100;
            salary = salary + raise;
        }
        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", hireDay=" + hireDay +
                    '}';
        }
    }

