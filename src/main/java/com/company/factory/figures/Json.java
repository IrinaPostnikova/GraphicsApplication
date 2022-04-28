package com.company.factory.figures;

import com.company.factory.FigureCreator;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.ArrayList;
import java.util.Arrays;
@JsonAutoDetect

public class Json {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 5);
        Point p3 = new Point(3, 5);
        Point p4 = new Point(5, 3);
        Point p5 = new Point(3, 1);

        ArrayList<Point> pointsRect = new ArrayList<>(Arrays.asList(p1, p3, p4, p5));
        ArrayList<Point> pointsTr = new ArrayList<>(Arrays.asList(p1, p2, p3));
        ArrayList<Point> pointsPoly = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        ArrayList<Point> pointsCircle = new ArrayList<>(Arrays.asList(p5, p3));
        FigureCreator fCr = new FigureCreator();

        Figure circle = fCr.create(pointsCircle);
        Figure rect = fCr.create(pointsRect);
        Figure triangle = fCr.create(pointsTr);
        Figure poly = fCr.create(pointsPoly);


        ArrayList<Figure> allFigures = new ArrayList<>(Arrays.asList(circle, rect, triangle, poly));

        ObjectMapper objectMapper =new ObjectMapper();

    }
}

