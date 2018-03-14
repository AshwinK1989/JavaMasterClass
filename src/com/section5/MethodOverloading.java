package com.section5;

public class MethodOverloading {


    public static double calcFeetAndInchesToCentimeters (double feet, double inches)  {


        if(feet>=0 && (inches>=0 && inches<=12)) {

            double cent= (inches*2.54+((feet*12)*2.54));

            System.out.println("The inches "+inches+ "The feet "+feet+"The centimeteres "+ cent);

            return cent;

        }
        else {

            return -1;
        }


    }



    public static void calcFeetAndInchesToCentimeters (double inches)  {

        double feet=0;

        if(inches>=0) {

             feet =inches/12;
            }

            calcFeetAndInchesToCentimeters(feet,inches);
        }





    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,0);
    }
}
