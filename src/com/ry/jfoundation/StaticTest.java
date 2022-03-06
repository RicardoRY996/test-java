package com.ry.jfoundation;

public class StaticTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        //print information
        for (Employee e : staff){
            e.setId();
            System.out.println("name = " + e.getName() + "salary = " + e.getSalary() +"id = " + e.getId());
        }
    }
}
class Employee{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;


    public static int getNextId() {
        return nextId;
    }
    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;//set id to next available id
        nextId++;
    }

    public static void main(String[] args) {
        var e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}