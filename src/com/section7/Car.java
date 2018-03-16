package com.section7;

import com.sun.javafx.binding.StringFormatter;

public class Car {


    private String model;
    private String colour;



    public void setModel(String model) {

       if(model.equalsIgnoreCase("corolla") || model.equalsIgnoreCase("altis"))  {

           this.model=model;

       }
       else {

           System.out.println("Model is invalid");
       }
    }

    public String getModel () {

        return this.model;
    }
}
