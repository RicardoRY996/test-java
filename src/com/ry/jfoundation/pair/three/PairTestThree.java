package com.ry.jfoundation.pair.three;

import com.ry.jfoundation.equals.EmployeeInEqualsTest;
import com.ry.jfoundation.equals.ManagerInEqualsTest;
import com.ry.jfoundation.pair.Pair;

public class PairTestThree {
    public static void main(String[] args) {
        var ceo = new ManagerInEqualsTest("Gus Greedy", 80000, 2003, 12, 15);
        var cfo = new ManagerInEqualsTest("Sid Sneaky", 60000, 2003, 12, 15);
        var buddies = new Pair<ManagerInEqualsTest>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        ManagerInEqualsTest[] managers = {ceo, cfo};

        var result = new Pair<EmployeeInEqualsTest>();
        minmaxBonus(managers, result);
        System.out.println("first: " + result.getFirst().getName()
                + ", second: " + result.getSecond().getName());
        System.out.println("first: " + result.getFirst().getName()
                + ", second: " + result.getSecond().getName());

    }
    public static void printBuddies(Pair<? extends ManagerInEqualsTest> p) {
        EmployeeInEqualsTest first = p.getFirst();
        EmployeeInEqualsTest second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }
    public static void minmaxBonus(ManagerInEqualsTest[] a, Pair<? super ManagerInEqualsTest> result) {
        if (a.length == 0){
            return;
        }
        ManagerInEqualsTest min = a[0];
        ManagerInEqualsTest max = a[0];
        for (int i = 1; i < a.length; i++){
            if (min.getBonus() > a[i].getBonus()){
                min = a[i];
            }
            if (max.getBonus() < a[i].getBonus()){
                max = a[i];
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void maxminBonus(ManagerInEqualsTest[] a, Pair<? super ManagerInEqualsTest> result){
        minmaxBonus(a, result);
        PairAlg.swapHelper(result); //OK--swapHelper captures wildcard type
    }
    //can't write public static <T super manager> ...
}


class PairAlg{
    public static boolean hasNulls(Pair<?> p){
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p){
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}