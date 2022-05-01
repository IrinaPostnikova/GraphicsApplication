package com.company;

import com.company.factory.FigureCreator;
import com.company.factory.figures.Figure;
import com.company.factory.figures.Frame;
import com.company.factory.figures.MyPanel;
import com.company.factory.figures.Point;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println("center" + rect.getCenter() );


        ArrayList<Figure> allFigures = new ArrayList<>(Arrays.asList(circle, rect, triangle, poly));

        try (ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("figures"))) {
            oos1.writeObject(allFigures);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        ArrayList<Figure> listFigures = new ArrayList<Figure>();
        try (ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("figures"))) {
            listFigures = ((ArrayList<Figure>) ois1.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        for (Figure f : listFigures)
            System.out.println(f);

        //окошко для рисования
        Frame fr= new Frame();
        MyPanel mp=new MyPanel(listFigures);
        fr.add(mp);
        fr.setVisible(true);





//        FigureCreator fCr3 = new FigureCreator();
//        Figure circle = fCr.create(pointsCircle);
//
//        FigureCreator fCr2 = new FigureCreator();
//        Figure rect = fCr.create(pointsRect);


        // System.out.println(circle);

        // Figure f3 = new Figure(); // так не будет работать тк фигуры абстрактный класс
        //  Figure f4 =(Figure)Triangle; upcast
        //   ((Triangle)f4)downcast


        //чтение из файла
//        File file=new File("\\D:\\texts\\text");
//        Scanner s=new Scanner(file);
//        while (s.hasNextLine()){
//            System.out.println(s.nextLine());
//        }
//          s.close();//не видит файл на компе

//        File file=new File("test");
//        Scanner s=new Scanner(file);
//        while (s.hasNextLine()){
//            System.out.println(s.nextLine());
//        }
//          s.close();

        //запись в файл
//        File file1=new File("file");
//        PrintWriter pw=new PrintWriter(file1);
//        pw.println(circle);
//        pw.close();
//
//        //чтение из файла через buffered
//        File file1 = new File("file");
//        FileReader fr = new FileReader(file1);
//        BufferedReader reader = new BufferedReader(fr);
//        String str;
//
//        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
//            String qq = String.valueOf(str.indexOf("a"));
//            System.out.println(qq);
        //        }


//        сериализация

//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("figures"))) {
//            oos.writeObject(circle);
//            oos.writeObject(rect);
//            oos.writeObject(triangle);
//            oos.writeObject(poly);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
////десериализация
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("figures"))) {
//            Figure figure = (Figure) ois.readObject();
//            Figure figure2 = (Figure) ois.readObject();
//            Figure figure1 = (Figure) ois.readObject();
//            Figure figure3 = (Figure) ois.readObject();
//            System.out.println(figure);
//            System.out.println(figure2);
//            System.out.println(figure1);
//            System.out.println(figure3);
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }


    }
}