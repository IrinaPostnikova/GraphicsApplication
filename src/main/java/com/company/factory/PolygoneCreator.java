package com.company.factory;

import com.company.factory.figures.Figure;
import com.company.factory.figures.Point;
import com.company.factory.figures.Polygone;

import java.util.ArrayList;

public class PolygoneCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Polygone(points);
    }
}
