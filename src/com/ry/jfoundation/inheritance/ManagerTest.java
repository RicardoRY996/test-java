package com.ry.jfoundation.inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        //construct a Manager object
        var boss = new ManagerInInheritance("Carl Cracker",80000,1997,12,15);
        boss.setBonus(5000);

        var staff = new EmployeeInInheritance[3];

        //fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new EmployeeInInheritance("Harry Hacker",50000,1989,10,1);
        staff[2] = new EmployeeInInheritance("Tommy Tester",40000,1990,3,15);

        //print out information about all Employee objects
        for (EmployeeInInheritance e : staff)
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());

    }
}
