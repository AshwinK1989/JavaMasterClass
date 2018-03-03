package com.datatypes;

public class DataTypes {


    public static void main (String [] args)  {

        byte firstByte = 127;
        short firstShort= 32767;
        int firstInt = 1024_37_768;
        long firstLong = 50000L + 10L *(firstByte+firstShort+firstInt);

        System.out.println("The long value is "+firstLong);
    }
}
