package com.company;

import com.company.factory.FigureCreator;
import com.company.figures.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 5);
        Point p3 = new Point(3, 5);
        Point p4 = new Point(5, 3);
        Point p5 = new Point(3, 1);

        ArrayList<Point> pointsRect = new ArrayList<>(Arrays.asList(p1,  p3, p4,p5));

        ArrayList<Point> pointsTr = new ArrayList<>(Arrays.asList(p1, p2, p3));

        ArrayList<Point> pointsPoly = new ArrayList<>(Arrays.asList(p1, p2, p3,p4,p5));

        ArrayList<Point> pointsCircle = new ArrayList<>(Arrays.asList(p5, p3));



//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());

//        axisPoint ap1 = new axisPoint(0, 1);
//        System.out.println(ap1);

//        Triangle triangle1 = new Triangle(pointsTr);
//        System.out.println(triangle1);
//
//        Rectangle rectangle = new Rectangle(pointsRect);
//        System.out.println(rectangle);
//
//        Polygone polygone = new Polygone(pointsPoly);
//        System.out.println(polygone);
//
//        Circle circle=new Circle(pointsCircle);
//        System.out.println(circle);


        //Figure f1 = new Triangle(points);
//        Figure f2 = new Rectangle(pointsRect);
//        System.out.println(rectangle.getPerimeter());
//        System.out.println();
//        System.out.println(rectangle.getArea());

        FigureCreator fCr=new FigureCreator();

        Figure circle= fCr.create(pointsCircle);
        System.out.println(circle);

        // Figure f3 = new Figure(); // так не будет работать тк фигуры абстрактный класс
        //  Figure f4 =(Figure)Triangle; upcast
        //   ((Triangle)f4)downcast

    }
}