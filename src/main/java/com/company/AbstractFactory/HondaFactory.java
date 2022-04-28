package com.company.AbstractFactory;

public class HondaFactory implements MotoFactory {
    @Override
    public Sport createSport(){
        return new HondaSport();
    }
    @Override
    public Tourist createTourist(){
        return new HondaTourist();
    }
    @Override
    public Cross createCross(){
        return new HondaCross();
    }
}
