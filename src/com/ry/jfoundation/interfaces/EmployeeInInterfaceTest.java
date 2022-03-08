package com.ry.jfoundation.interfaces;


public class EmployeeInInterfaceTest implements Comparable<EmployeeInInterfaceTest>{
    private String name;
    private double salary;

    public EmployeeInInterfaceTest(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Compares employees by salary
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * other Object, 0 if the salaries are the same, a positive value otherwise
     */
    @Override
    public int compareTo(EmployeeInInterfaceTest other) {
        return Double.compare(salary, other.salary);
    }
}
