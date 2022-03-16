package com.ry.jfoundation.map;


import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        var staff = new HashMap<String, EmployeeInMapTest>();
        staff.put("144-25-5464", new EmployeeInMapTest("Amy Lee"));
        staff.put("567-24-2546", new EmployeeInMapTest("Harry Hacker"));
        staff.put("157-62-7935", new EmployeeInMapTest("Gary Cooper"));
        staff.put("456-62-5527", new EmployeeInMapTest("Francesca Cruz"));

        //print all entries

        System.out.println(staff);

        //remove an entry

        staff.remove("567-24-2546");

        // replace an entry

        staff.put("456-62-5527", new EmployeeInMapTest("Francesca Miller"));

        //look up a value

        System.out.println(staff.get("157-62-7935"));

        //iterate through all entries

        staff.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));

    }
}
