package com.ry.jfoundation;

import java.util.Random;

public class Constructor {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        var staff = new Employee3[3];
        staff[0] = new Employee3("Harry",40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();

        //print out
        for ( Employee3 e : staff){
            System.out.println("name = "+e.getName()+" salary = "+e.getSalary()+" id = "+ e.getId());
        }
    }
}

class Employee3{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    //static initialization block
    static {
        var generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }
    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructors
    public Employee3(String n,double s){
        name = n;
        salary = s;
    }
    public Employee3(double s){
        //calls the Employee(String, double) constructor
        this("Employee #"+nextId,s);
    }
    //the default constructor
    public Employee3(){
        //name initialized to ""--see above
        //salary not explicitly set--initialized to 0
        //id initialized in initialization block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
