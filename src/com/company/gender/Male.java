package com.company.gender;

public class Male implements Gender{
    @Override
    public void male() {
        System.out.println("Male");
    }

    @Override
    public void female() {
        System.out.println("Female");

    }
}
