package com.company;

import com.company.figures.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        Point p1 = new Point(2, 2);
//        Point p2 = new Point(3, 3);
//        Point p3 = new Point(4, 4);
//
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        axisPoint ap1 = new axisPoint(0, 1);
//        System.out.println(ap1);
//
//        Triangle triangle1 = new Triangle(p1,p2,p3);
//        System.out.println(triangle1);
//
//        Rectangle rectangle= new Rectangle (new Point(5,6),p1,p2,p3);
//        System.out.println(rectangle);
//    }


        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(5, 5);

        ArrayList<Point> pointsRect = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
        pointsRect.add(p1);
        pointsRect.add(p2);
        pointsRect.add(p3);
        pointsRect.add(p4);

        ArrayList<Point> pointsTr = new ArrayList<>(Arrays.asList(p1, p2, p3));
        pointsTr.add(p1);
        pointsTr.add(p2);
        pointsTr.add(p3);

        ArrayList<Point> pointsPoly = new ArrayList<>(Arrays.asList(p2, p4, p3,p1));
        pointsPoly.add(p1);
        pointsPoly.add(p2);
        pointsPoly.add(p3);
        pointsPoly.add(p4);



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        axisPoint ap1 = new axisPoint(0, 1);
        System.out.println(ap1);

        Triangle triangle1 = new Triangle(pointsTr);
        System.out.println(triangle1);


        Rectangle rectangle = new Rectangle(pointsRect);
        System.out.println(rectangle);

        Polygone polygone = new Polygone(pointsPoly);
        System.out.println(polygone);


        //Figure f1 = new Triangle(points);
        //Figure f2 = new Rectangle(points);


        // Figure f3 = new Figure(); // так не будет работать тк фигуры абстрактный класс
        //  Figure f4 =(Figure)Triangle; upcast
        //   ((Triangle)f4)downcast

    }
}