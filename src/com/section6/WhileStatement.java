package com.section6;

public class WhileStatement {


    public static void main(String[] args) {

        int count=1;

        while (count!=6)  {

            System.out.println("The count is "+count);
            count++;
        }

        //The For statement equivalent to above while statement

        for(count =1;count!=6;count++)  {

            System.out.println("The for count is "+count);

        }
    }
}
