package com.company.work;

public class Teacher implements Work{
    @Override
    public void JobName() {
        System.out.println("INHA");
    }

    @Override
    public void JobTitle() {
        System.out.println("Teacher");

    }

    @Override
    public void JobAddress() {
        System.out.println("blok Chilonzor");

    }
}
