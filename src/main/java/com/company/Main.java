package com.company;

import com.company.factory.FigureCreator;
import com.company.figures.Figure;
import com.company.figures.Frame;
import com.company.figures.MyPanel;
import com.company.figures.Point;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


import static com.company.figures.Json.readFromFileJson;
import static com.company.figures.Json.writeToFileJson;

public class Main {

    public static void main(String[] args) throws IOException {
        Point p1 = new Point(100, 300);
        Point p2 = new Point(100, 500);
        Point p3 = new Point(300, 500);
        Point p4 = new Point(500, 300);
        Point p5 = new Point(300, 100);

        ArrayList<Point> pointsRect = new ArrayList<>(Arrays.asList(p1, p3, p4, p5));
        ArrayList<Point> pointsTr = new ArrayList<>(Arrays.asList(p1, p2, p3));
        ArrayList<Point> pointsPoly = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        ArrayList<Point> pointsCircle = new ArrayList<>(Arrays.asList(p1, p3));


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

        FigureCreator fCr = new FigureCreator();

        Figure circle = fCr.create(pointsCircle);
        Figure rect = fCr.create(pointsRect);
        Figure triangle = fCr.create(pointsTr);
        Figure poly = fCr.create(pointsPoly);
        System.out.println("center" + rect.getCenter());
        System.out.println(pointsTr);
        triangle.rotate(30);
        System.out.println(triangle);


        ArrayList<Figure> allFigures = new ArrayList<>(Arrays.asList(circle, rect, triangle, poly));

//запись в Json
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        BufferedWriter bWriter = new BufferedWriter(new FileWriter("fileJson", true));
        for (var f : allFigures) {
            mapper.writeValue(writer, f);
            writer.write("\n");
        }
        bWriter.write(writer.toString());
        bWriter.close();
        System.out.println(writer.toString());


        //считываем из файла Json
        BufferedReader bReader =new BufferedReader(new FileReader("fileJson"));
        ObjectMapper oMapper =new ObjectMapper();

//        ArrayList<Figure> listFigures = new ArrayList<Figure>();
//
//        ObjectMapper oMapper =new ObjectMapper();
//        String json;
//        while ((json= bReader.readLine() )!=null) {
//            listFigures.add(oMapper.readValue(json, Figure.class));
//        }
//        bReader.close();
//        System.out.println("schitano");
//        return listFigures;

        //  writeToFileJson(allFigures,"J");

//        try (ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("figures"))) {
//            oos1.writeObject(allFigures);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//
//        ArrayList<Figure> listFigures = new ArrayList<Figure>();
//        try (ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("figures"))) {
//            listFigures = ((ArrayList<Figure>) ois1.readObject());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        for (Figure f : listFigures)
//            System.out.println(f);

        // ArrayList<Figure> figFromJson=readFromFileJson("J");

//        //окошко для рисования
//        Frame fr= new Frame();
//        MyPanel mp=new MyPanel(figFromJson);
//        fr.add(mp);
//        fr.setVisible(true);


        // Figure f3 = new Figure(); // так не будет работать тк фигуры абстрактный класс
        //  Figure f4 =(Figure)Triangle; upcast
        //   ((Triangle)f4)downcast


    }
}