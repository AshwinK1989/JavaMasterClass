package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCollections {

    public static void main (String [] args) {

        List<Integer> numberLists = new ArrayList<>();

        numberLists.add(151);
        numberLists.add(189);
        numberLists.add(164);
        numberLists.add(132);
        numberLists.add(155);

        //Collections.sort(numberLists);

        Comparator numListComparator = new NumList();
        Collections.sort(numberLists,numListComparator);

        System.out.println("The sorted number List is ");

        for(Integer numberList:numberLists) {

            System.out.println(numberList);

        }

    }
}

class NumList implements Comparator<Integer> {


    @Override
    public int compare(Integer num1, Integer num2) {

        if(num1%10>num2%10) {

            return 1;
        } else if(num1%10<num2%10) {

            return -1;
        }

        return 0;
    }
}


