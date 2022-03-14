package com.ry.jfoundation.linked.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //merge the words from b into a

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext()){
            if (aIter.hasNext()){
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        //remove every second word from b

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next(); // skip one element
            if (bIter.hasNext()){
                bIter.next(); // skip next element
                bIter.remove(); // remove that element
            }
        }
        System.out.println(b);

        //bulk operation: remove all words in b from a

        a.removeAll(b);

        System.out.println(a);
    }


}
