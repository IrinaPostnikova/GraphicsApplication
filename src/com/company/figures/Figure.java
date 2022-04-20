package com.company.figures;

import java.util.ArrayList;

public abstract class Figure {
    ArrayList<Point> points;

    public Figure(ArrayList<Point> points) {
        this.points = points;
    }

    public String toString() {
        return "Hello, I`m a " + this.getClass().getSimpleName().toString() + "  with points:  " + points + "my perimeter" +getPerimeter();
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

    public void printPerimeter() {
        System.out.println("My perimeter is " + getPerimeter());
    }

    public void printArea() {
        System.out.println("My area is " + getArea());
    }

}