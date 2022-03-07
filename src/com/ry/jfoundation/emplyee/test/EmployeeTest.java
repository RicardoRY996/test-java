package com.ry.jfoundation.emplyee.test;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        EmployeeInEmployeeTest[] staff = new EmployeeInEmployeeTest[3];

        staff[0] = new EmployeeInEmployeeTest("Ry", 75000, 1987, 12, 15);
        staff[1] = new EmployeeInEmployeeTest("ll", 50000, 1989, 10, 1);
        staff[2] = new EmployeeInEmployeeTest("hh", 40000, 1990, 3, 15);

        //raise everyone's salary by 5%
        for (EmployeeInEmployeeTest e : staff)
            e.raiseSalary(5);

        //print out about all object
        for (EmployeeInEmployeeTest e : staff)
            System.out.println("name=" + e.getName() + " salary=" + e.getSalary() + " hireDay=" + e.getHireDay());
//            e.toString();
    }
}
class EmployeeInEmployeeTest {
        private String name;
        private double salary;
        private LocalDate hireDay;

        public EmployeeInEmployeeTest(String name, double salary, int year, int month, int day){
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

