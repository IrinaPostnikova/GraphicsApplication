package com.company.factory;

import com.company.factory.figures.Figure;
import com.company.factory.figures.Point;

import java.util.ArrayList;

public interface IFigureCreator {
    public Figure create(ArrayList<Point> points);
}
