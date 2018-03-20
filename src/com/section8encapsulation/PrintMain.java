package com.section8encapsulation;

public class PrintMain {

    public static void main(String[] args) {
        Printer print = new Printer(120,100,"Duplex");
        print.fillToner(20);
        print.printPages(35);
    }
}
