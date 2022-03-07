package com.ry.jfoundation.arraylist;

import com.ry.jfoundation.equals.EmployeeInEqualsTest;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //fill the staff array list with three Employee objects
        var staff = new ArrayList<EmployeeInEqualsTest>();

        staff.add(new EmployeeInEqualsTest("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new EmployeeInEqualsTest("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new EmployeeInEqualsTest("Tony Tester", 40000, 1990, 3, 15));

        //raise everyone's salary by 5%
        for (EmployeeInEqualsTest e : staff){
            e.raiseSalary(5);
        }

        //print out information about all Employee objects
        for (EmployeeInEqualsTest e : staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}
