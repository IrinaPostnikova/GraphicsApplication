package com.company.factory.figures;


import java.util.ArrayList;

public class Rectangle extends Figure {
//    private Point a;
//    private Point b;
//    private Point c;
//    private Point d;

    public Rectangle(ArrayList<Point> points) {
        super(points);
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        this.d = d;
    }

    @Override
    public Figure move(int a, int b) {
        return null;
    }

    @Override
    public Figure rotate(int n) {
        return null;
    }

    @Override
    public Figure scale(int n) {
        return null;
    }
    @Override
    public double getRadius() {

        return 0;
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
//
//    public Point getD() {
//        return d;
//    }

//    @Override
//    public String toString() {
//        return "Rectangle:" +
//                "point a= " + a +
//                ", point b=" + b +
//                ", point c=" + c +
//                ", point d=" + d;
//
//    }

}



