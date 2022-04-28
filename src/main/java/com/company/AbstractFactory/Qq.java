package com.company.AbstractFactory;

public class Qq {
    public static void main(String[] args) {
        MotoFactory motoFactory;
        motoFactory=new HondaFactory();
        System.out.println(motoFactory.createCross());
    }
}
