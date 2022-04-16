package com.company.factory;

import com.company.figures.Figure;
import com.company.figures.Point;
import com.company.figures.Triangle;

import java.util.ArrayList;

public class TriangleCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Triangle(points);
    }
}
