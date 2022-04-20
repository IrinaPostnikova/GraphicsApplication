package com.company.AbstractFactory;

public class YamahaFactory implements MotoFactory {
    @Override
    public Sport createSport(){
        return new YamahaSport();
    }
    @Override
    public Tourist createTourist(){
        return new YamahaTourist();
    }
    @Override
    public Cross createCross(){
        return new YamahaCross();
    }
}
