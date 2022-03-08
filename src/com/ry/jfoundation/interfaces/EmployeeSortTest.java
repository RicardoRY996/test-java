package com.ry.jfoundation.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new EmployeeInInterfaceTest[3];

        staff[0] = new EmployeeInInterfaceTest("Harry Hacker", 35000);
        staff[1] = new EmployeeInInterfaceTest("Carl Cracker", 75000);
        staff[2] = new EmployeeInInterfaceTest("Tony Tesrer", 38000);

        Arrays.sort(staff);

        //print out information about all Employee objects
        for (EmployeeInInterfaceTest e : staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
        var a = staff[1];
        var b = staff[2];

//        System.out.println(a.compareTo(b));
    }
}
