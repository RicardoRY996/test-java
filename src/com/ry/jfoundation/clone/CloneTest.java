package com.ry.jfoundation.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        var original = new EmployeeInCloneTest("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        EmployeeInCloneTest copy = original.clone();

        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);

        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
