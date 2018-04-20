package com.section9;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorLearning {


    public static void main (String [] args)  {

        LinkedList <String> linkedList = new LinkedList<String>();
        linkedList.add("Dadar");
        linkedList.add("Ashwin");
        linkedList.add("Mulund");
        linkedList.add("Vaishnvai");

        printList(linkedList);
    }


    public static void printList(LinkedList<String> linkedList)  {

       ListIterator<String> listIterator = linkedList.listIterator();

       while (listIterator.hasNext()) {

          System.out.println("The value is "+listIterator.next());
       }

    }

}
