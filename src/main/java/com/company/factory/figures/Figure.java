package com.company.factory.figures;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.ArrayList;

@JsonAutoDetect
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Triangle.class, name = "Triangle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "Rectangle"),
        @JsonSubTypes.Type(value = Circle.class, name = "Circle"),
        @JsonSubTypes.Type(value = Polygone.class, name = "Polygone"),
}
)

public abstract class Figure implements Serializable, IMovable, IScalable, IRotatable {
    ArrayList<Point> points;


    public Figure(ArrayList<Point> points) {
        this.points = points;

    }


    public String toString() {
        return "Hello, I`m a " + this.getClass().getSimpleName().toString() + " , with points:  " + points + " my perimeter is " + getPerimeter() + " my area is " + getArea();
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
        for (int i = 0; i < this.points.size() - 1; i++) {
            area += (points.get(i).getX() * points.get(i + 1).getY()) - (points.get(i + 1).getX() * points.get(i).getY());
        }
        area += (points.get(points.size() - 1).getX() * points.get(0).getY()) - (points.get(0).getX() * points.get(points.size() - 1).getX());
        return Math.abs(area / 2);
    }

    public Point getCenter() {
        double minX = points.get(0).getX();
        double maxX = points.get(0).getX();
        double minY = points.get(0).getY();
        double maxY = points.get(0).getY();

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

    public ArrayList<Point> getPoints() {
        return this.points;
    }

    public void printPerimeter() {
        System.out.println(" My perimeter is " + getPerimeter());
    }

    public void printArea() {
        System.out.println(" My area is " + getArea());
    }


    public void move(Point a) {
        for (int i = 0; i < points.size(); i++) {
            points.get(i).setX(points.get(i).getX() + a.getX());
            points.get(i).setY(points.get(i).getY() + a.getY());
        }
    }

    public void rotate(int a) {

        for (int i = 0; i < points.size(); i++) {
            points.get(i).setX(((points.get(i).getX() - getCenter().getX()) * Math.cos(Math.toRadians(a)) + getCenter().getX()));
            points.get(i).setY(((points.get(i).getY() - getCenter().getY()) * Math.cos(Math.toRadians(a)) + getCenter().getY()));
        }
    }

    public void scale(int b) {
        for (int i = 0; i < points.size(); i++) {
            points.get(i).setX(((points.get(i).getX() - getCenter().getX() * b) + getCenter().getX()));
            points.get(i).setY(((points.get(i).getY() - getCenter().getY() * b) + getCenter().getY()));
        }
        getPerimeter();
        getArea();
    }
}