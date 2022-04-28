package com.company.factory;

import com.company.factory.figures.Figure;
import com.company.factory.figures.Point;
import com.company.factory.figures.Triangle;

import java.util.ArrayList;

public class TriangleCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Triangle(points);
    }
}
