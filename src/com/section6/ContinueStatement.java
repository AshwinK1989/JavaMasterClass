package com.section6;

public class ContinueStatement {

    public static void main(String[] args) {

        int count =1;


        while (count<=10)  {
            count++;

            if(count==9) {
                continue;
            }
            System.out.println("The value of count is "+count);


        }

    }
}
