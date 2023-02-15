package com.company.figures;


import com.company.interfaces.IMovable;
import com.company.interfaces.IRotatable;
import com.company.interfaces.IScalable;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

@JsonAutoDetect
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Triangle.class, name = "Triangle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "Rectangle"),
        @JsonSubTypes.Type(value = Circle.class, name = "Circle"),
        @JsonSubTypes.Type(value = Polygone.class, name = "Polygone"),
}
)
@JsonIgnoreProperties({"perimeter", "area", "center"})

public abstract class Figure implements Serializable, IMovable, IScalable, IRotatable {
    @Serial
    private static final long serialVersionUID = 1L;

    public Figure() {
    }

    public ArrayList<Point> points;


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

    public void rotate(double a) {
        double side = 0;
        a = Math.toRadians(a);
        Point center=getCenter();
        for (int i = 0; i < points.size(); i++) {

            double x= ((points.get(i).getX()-center.getX())*Math.cos(a)-(points.get(i).getY()-center.getY())*Math.sin(a));
            double y= ((points.get(i).getX()-center.getX())*Math.cos(a)+(points.get(i).getY()-center.getY())*Math.sin(a));
            points.set(i,new Point(x+center.getX(),y+center.getY()));
        }
    }

    public void scale(int b) {
        Point center=getCenter();
        for (int i = 0; i < points.size(); i++) {
            points.get(i).setX((((points.get(i).getX() - center.getX()) * b) + center.getX()));
            points.get(i).setY((((points.get(i).getY() - center.getY()) * b) + center.getY()));
        }
        getPerimeter();
        getArea();
    }

    public boolean containPoint(int x, int y) {
        boolean flag = false;
        for (int i = 0; i < this.getPoints().size(); i++) {
            int j = i == this.getPoints().size() - 1 ? 0 : i + 1;
            double x1 = this.getPoints().get(i).getX();
            double x2 = this.getPoints().get(j).getX();
            double y1 = this.getPoints().get(i).getY();
            double y2 = this.getPoints().get(j).getY();
            if (x2 - x1 != 0) {
                double a = (y2 - y1) / (x2 - x1);
                double b = y1 - a * x1;
                if ((Math.abs(y - (int) (a * x + b)) <= 2)) flag = true;
            } else {
                if ((Math.abs(x - x1) <= 2) && (y > Math.min(y1, y2) && y <= Math.max(y2, y1))) flag = true;
            }
        }
        return flag;
    }
}