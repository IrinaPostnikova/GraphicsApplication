package com.company.factory;

import com.company.figures.Figure;
import com.company.figures.Point;
import com.company.figures.Rectangle;

import java.util.ArrayList;

public class RectangleCreator implements IFigureCreator {
    public Figure create(ArrayList<Point> points) {
        return new Rectangle(points);
    }
}
