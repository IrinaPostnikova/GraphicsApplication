package com.company.factory.figures;

import java.util.ArrayList;

public class Polygone extends Figure {

    public Polygone(ArrayList<Point> points) {
        super(points);
    }

    @Override
    public Figure move(int a, int b) {
        return null;
    }

    @Override
    public Figure rotate(int n) {
        return null;
    }

    @Override
    public Figure scale(int n) {
        return null;
    }

    @Override
    public double getRadius() {

        return 0;
    }
}
