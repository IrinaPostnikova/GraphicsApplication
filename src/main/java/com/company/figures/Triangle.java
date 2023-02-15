package com.company.figures;

import java.util.ArrayList;

public class Triangle extends Figure {
public Triangle(){

}

    public Triangle(ArrayList<Point> points) {
        super(points);
//        this.a = a;
//        this.b = b;
//        this.c = c;
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
        n = Math.toRadians(n);
        Point center=getCenter();
        for (int i = 0; i < points.size(); i++) {
//            side = Math.sqrt(Math.pow((points.get(i).getX() - getCenter().getX()), 2) + Math.pow((points.get(i).getY() - getCenter().getY()), 2));
//
//            points.get(i).setX(side * (Math.cos(a)) + getCenter().getX());
//            points.get(i).setY(side * (Math.cos(a)) + getCenter().getY());
            double x= ((points.get(i).getX()-center.getX())*Math.cos(n)-(points.get(i).getY()-center.getY())*Math.sin(n));
            double y= ((points.get(i).getX()-center.getX())*Math.cos(n)+(points.get(i).getY()-center.getY())*Math.sin(n));
            points.set(i,new Point(x+center.getX(),y+center.getY()));
        }
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



//    public Point getA() {
//        return a;
//    }
//
//    public Point getB() {
//        return b;
//    }
//
//    public Point getC() {
//        return c;
//    }

//    @Override
//    public String toString() {
//        return "Triangle:" +
//                "point a= " + a +
//                ", point b=" + b +
//                ", point c=" + c;
//
//    }
}