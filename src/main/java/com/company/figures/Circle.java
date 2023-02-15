package com.company.figures;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties({"radius", "perimeter", "area", "center"})

public class Circle extends Figure {

    double radius;

    public Circle() {

    }

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


    @Override
    public void move(Point a) {
        for (int i = 0; i < points.size(); i++) {
        points.get(i).setX(points.get(i).getX() + a.getX());
        points.get(i).setY(points.get(i).getY() + a.getY());
    }

    }

    @Override
    public void rotate(double n) {

    }

    @Override
    public void scale(int n) {
        Point center=getCenter();
        for (int i = 0; i < points.size(); i++) {
            points.get(i).setX((((points.get(i).getX() - center.getX()) * n) + center.getX()));
            points.get(i).setY((((points.get(i).getY() - center.getY()) * n) + center.getY()));
        }
        getPerimeter();
        getArea();
    }

    @Override
    public boolean containPoint(int x, int y) {
        //boolean flag = false;
        Point center=getCenter();
        double distance = Math.sqrt(Math.pow((x - center.getX()), 2) + Math.pow((y - center.getY()), 2));
       // if (distance<=radius) //flag = true;
        return (distance<=(radius+3));


        //(x - x0)^2 + (y - y0)^2 <= R^2

    }
}
