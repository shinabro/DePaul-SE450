package edu.depaul.cdm.se450.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        printList(getNamesAsList());
        System.out.println("------------------");
        printList(getNamesAsSet());
    }

    private static Iterator getNamesAsList() {
        ArrayList aRay = new ArrayList();
        aRay.add("James");
        aRay.add("Jim");
        aRay.add("James");
        return aRay.iterator();
    }

    private static Iterator getNamesAsSet() {
        HashSet aRay = new HashSet();
        aRay.add("James");
        aRay.add("Jim");
        aRay.add("James");
        return aRay.iterator();
    }

    private static void printList(Iterator it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
