package com.company.factory;

import com.company.factory.figures.Circle;
import com.company.factory.figures.Figure;
import com.company.factory.figures.Point;

import java.util.ArrayList;

public class CircleCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Circle(points);
    }
}
