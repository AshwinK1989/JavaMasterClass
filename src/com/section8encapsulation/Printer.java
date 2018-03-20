package com.section8encapsulation;

public class Printer {

    private int tonerLevel = 20;
    private int numberOfPagesPrinted = 0;
    private String printerType;


    public Printer(int tonerLevel, int numberOfPagesPrinted,String printerType) {

        if(tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.printerType=printerType;
    }


    public void fillToner (int addToner) {

        if(tonerLevel+addToner<100) {
            tonerLevel += addToner;
        }
        System.out.println("The toner Level is "+tonerLevel);
    }

    public void printPages (int addPages) {

        numberOfPagesPrinted+=addPages;

        System.out.println("The number of pages printed "+numberOfPagesPrinted);
    }



}

