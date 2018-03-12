package com.datatypes;

public class FloatDouble {

    public static void main (String [] args)  {

      float floatValue = 5f/3f;

      double doubleValue = 5d/3d;

      System.out.println(floatValue);
      System.out.println(doubleValue);

      //Covert given number of pounds to kilograms

      double poundsValue = 200d;
      double kilogramsValue = 0.45_359_237;

      double updatedKilogramValue = poundsValue * (kilogramsValue);

      System.out.println("The updated kilogram value is "+updatedKilogramValue);

    }
}
