package com.company.information;

public class Requierment implements Information{
    @Override
    public void firstname() {
        System.out.println("Kamola");
    }

    @Override
    public void lastname() {
        System.out.println("Komiljonova");

    }

    @Override
    public void address() {
        System.out.println("block Uchtepa");

    }

    @Override
    public void phonenumber() {
        System.out.println("974563245");

    }
}
