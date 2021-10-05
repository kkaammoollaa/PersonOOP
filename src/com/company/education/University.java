package com.company.education;

public class University implements Education{
    @Override
    public void education() {
        this.Kamola();
        System.out.println("University");
        System.out.println("Max number: " + this.maxFunction(19, 15, 61));
    }

    @Override
    public void period() {

        System.out.println(" between 18-30 ");

    }

    public void Kamola(){
        System.out.println("Polvon komosh!");
    }

    public int maxFunction(int a, int b, int c)
    {
        int max =a;
        if(max < b)
            max = b;
        if(max < c)
            max = c;

        return max;
    }
}
