package com.immutable;

import java.util.Date;

public final class ImmutableClass {

    private final String name;
    private final int age;
    private final Date mutableField;

    public ImmutableClass(String name, int age, Date mutableField) {
        this.name = name;
        this.age = age;
        this.mutableField = new Date(mutableField.getTime());
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getMutableField() {
        return new Date(mutableField.getTime());
    }





}
