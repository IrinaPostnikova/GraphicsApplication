package com.company.AbstractFactory;

public class KawasakiFactory implements MotoFactory {
    @Override
    public Sport createSport(){
        return new KawasakiSport();
    }
    @Override
    public Tourist createTourist(){
        return new KawasakiTourist();
    }
    @Override
    public Cross createCross(){
        return new KawasakiCross();
    }
}
