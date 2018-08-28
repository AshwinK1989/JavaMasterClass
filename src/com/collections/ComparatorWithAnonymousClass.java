package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithAnonymousClass {

    public static void main (String [] args) {

        List<Integer> numberLists = new ArrayList<>();

        numberLists.add(151);
        numberLists.add(189);
        numberLists.add(164);
        numberLists.add(132);
        numberLists.add(155);

        //Collections.sort(numberLists);


        Collections.sort(numberLists,new Comparator <Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {


                return num1%10>num2%10?1:num1%10<num2%10?-1:0;
            }});

        System.out.println("The sorted number List is ");

        for(Integer numberList:numberLists) {

            System.out.println(numberList);

        }



    }}
