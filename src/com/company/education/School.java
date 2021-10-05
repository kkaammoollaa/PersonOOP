package com.company.education;

public class School implements Education{
    @Override
    public void education() {
        System.out.println("School");
        this.Max();
    }

    @Override
    public void period() {
        System.out.println(" between 7- 16 ");

    }

    public void Max(){

        System.out.println(" Max ,you are the best");
    }
}
