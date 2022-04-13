package com.company.figures;

import com.company.figures.Figure;

import java.util.ArrayList;

public class Circle extends Figure {
    double radius;

    public Circle(ArrayList<Point> points) {
        super(points);
        this.radius = getRadius();
    }

    public double getRadius() {
        Point a = points.get(0);
        Point b = points.get(1);
        double radius = Math.sqrt((Math.pow((b.getX() - a.getX()), 2)) + (Math.pow((b.getY() - a.getY()), 2)));
        return radius;
    }

    //    @Override
//    public String toString() {
//        return "Circle";
//    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * getRadius();
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }


}
