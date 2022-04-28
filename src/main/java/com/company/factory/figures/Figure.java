package com.company.factory.figures;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Figure implements Serializable, IMovable, IScalable, IRotatable {
    ArrayList<Point> points;
    double radius;

    public Figure(ArrayList<Point> points) {
        this.points = points;
        this.radius=getRadius();
    }

    public String toString() {
        return "Hello, I`m a " + this.getClass().getSimpleName().toString() + " , with points:  " + points + " my perimeter is " + getPerimeter() + " my area is " + getArea() ;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < points.size(); i++) {
            perimeter += Math.sqrt(Math.pow(points.get(i).getX() - points.get(i - 1).getX(), 2) + Math.pow(points.get(i).getY() - points.get(i - 1).getY(), 2));
        }
        //Добавить периметр для первого и последнего
        perimeter += Math.sqrt(Math.pow(points.get(points.size() - 1).getX() - points.get(0).getX(), 2) + Math.pow(points.get(points.size() - 1).getY() - points.get(0).getY(), 2));
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        for (int i = 0; i < this.points.size(); i++) {
            int temp = i + 1 < points.size() ? i + 1 : 0;
            area += points.get(i).getX() * points.get(temp).getY() - points.get(i).getY() * points.get(temp).getX();
        }
        // area += points.get(i).getX() * points.get(i + 1).getY() - points.get(i).getY() * points.get(i + 1).getX();
        return Math.abs(area / 2);
    }

    public Point getCenter(ArrayList<Point> points) {
        double minX = points.get(0).getX();
        double maxX = points.get(0).getX();
        double minY = points.get(0).getX();
        double maxY = points.get(0).getX();

        for (var point : this.points) {
            if (point.getX() > maxX) {
                maxX = point.getX();
            }
            if (point.getX() < minX) {
                minX = point.getX();
            }
            if (point.getY() > maxY) {
                maxY = point.getY();
            }
            if (point.getY() < minY) {
                minY = point.getY();
            }
        }
        return new Point(((maxX + minX) / 2), ((maxY + minY) / 2));
    }
    public ArrayList<Point> getPoints(){        return this.points;    }

    public void printPerimeter() {
        System.out.println(" My perimeter is " + getPerimeter());
    }

    public void printArea() {
        System.out.println(" My area is " + getArea());
    }
    public double getRadius() {
        Point a = points.get(0);
        Point b = points.get(1);
        double radius = Math.sqrt((Math.pow((b.getX() - a.getX()), 2)) + (Math.pow((b.getY() - a.getY()), 2)));
        return radius;
    }

    public void move() {

    }

    public void rotate() {

    }

    public void scale() {

    }
}