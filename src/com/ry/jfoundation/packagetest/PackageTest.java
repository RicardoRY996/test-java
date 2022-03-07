package com.ry.jfoundation.packagetest;

import com.ry.jfoundation.packagetest.corejava.EmployeeInPackageTest;

import static java.lang.System.out;

public class PackageTest {
    public static void main(String[] args) {
        //because of the import statement, we don't have to use
        var harray = new EmployeeInPackageTest("Ha",50000,1989,10,1);

        harray.raiseSalary(5);

        //because of static import statement, we don't have to use System.out here
        out.println("name="+harray.getName()+" salary="+harray.getSalay());

    }
}
