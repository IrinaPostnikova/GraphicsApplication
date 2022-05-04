package com.company.factory;

import com.company.figures.Figure;
import com.company.figures.Point;


import java.util.ArrayList;

public class FigureCreator implements IFigureCreator {

    @Override
    public Figure create(ArrayList<Point> points) {
        int nPoints = points.size();
        if (nPoints == 2) return new CircleCreator().create(points);
        else if (nPoints == 3) return new TriangleCreator().create(points);
        else if (nPoints == 4) return new RectangleCreator().create(points);
        else if (nPoints > 2) return new PolygoneCreator().create(points);
        else return null;
    }
}
