package com.ry.jfoundation;

public class ParamTest {
    public static void main(String[] args) {
        /*
        Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);
        /*
        Mothods can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary:");
        var harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());


        /*
        Methods can change the state of object parameters
         */

        System.out.println("\nTesting swap:");
        Employee2 a = new Employee2("Alice", 70000);
        Employee2 b = new Employee2("Bob",60000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a,b);
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());


    }

    private static void tripleSalary(Employee2 x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary="+x.getSalary());
    }

    private static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }

    private static void tripleValue(double x) {//does't work
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }
}
class Employee2{//simplified Employee class
    private String name;
    private double salary;

    public Employee2(String n,double s){
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary += raise;
    }
}
