package com.qalabs.javabasics;

import java.util.ArrayList;
import java.util.List;

public class IterateList {
    public static void main (String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);

        // Iterate using for
        for(int i=0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // For each
        for(Integer myNum: myList) {
            System.out.println(myNum);
        }
    }
}

