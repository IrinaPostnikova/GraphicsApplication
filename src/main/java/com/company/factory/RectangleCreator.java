package com.company.factory;

import com.company.factory.figures.Figure;
import com.company.factory.figures.Point;
import com.company.factory.figures.Rectangle;

import java.util.ArrayList;

public class RectangleCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Rectangle(points);
    }
}
