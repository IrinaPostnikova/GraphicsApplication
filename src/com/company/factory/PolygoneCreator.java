package com.company.factory;

import com.company.figures.Circle;
import com.company.figures.Figure;
import com.company.figures.Point;
import com.company.figures.Polygone;

import java.util.ArrayList;

public class PolygoneCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Polygone(points);
    }
}
