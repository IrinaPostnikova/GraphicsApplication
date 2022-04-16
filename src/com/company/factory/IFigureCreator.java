package com.company.factory;

import com.company.figures.Figure;
import com.company.figures.Point;

import java.util.ArrayList;

public interface IFigureCreator {
    public Figure create(ArrayList<Point> points);
}
