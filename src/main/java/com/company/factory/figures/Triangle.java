package com.company.factory.figures;

import java.util.ArrayList;

public class Triangle extends Figure {
    //три точки с вершинами
//    private Point a;
//    private Point b;
//    private Point c;

    public Triangle(ArrayList<Point> points) {
        super(points);
//        this.a = a;
//        this.b = b;
//        this.c = c;
    }



    @Override
    public void move(Point a) {

    }

    @Override
    public void rotate(int n) {

    }

    @Override
    public void scale(int n) {

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