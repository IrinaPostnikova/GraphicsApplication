package com.company.figures;

import java.util.ArrayList;

public class Polygone extends Figure {
    public Polygone(){

    }

    public Polygone(ArrayList<Point> points) {
        super(points);
    }

    @Override
    public void move (Point a) {
        for (int i = 0; i < points.size(); i++) {
            points.get(i).setX(points.get(i).getX() + a.getX());
            points.get(i).setY(points.get(i).getY() + a.getY());
        }
    }

    @Override
    public void rotate(double a) {

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




}
