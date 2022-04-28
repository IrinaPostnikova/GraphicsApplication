package com.company.factory.figures;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    private ArrayList<Figure> figures;

    public MyPanel(ArrayList<Figure> figures) {
        super();
        this.figures = figures;
    }


    public void paintComponent(Graphics gr) {
        for (var fig : figures) {

            for (int i = 0; i < fig.getPoints().size() - 1; i++) {
                if (fig.getPoints().size()==2){
                    gr.drawOval((int)fig.getPoints().get(0).getX(), (int) fig.getPoints().get(0).getY(), (int) (fig.getRadius()*2), (int) (fig.getRadius()*2));
                }
                  else{
                gr.drawLine((int) fig.getPoints().get(i).getX(), (int) fig.getPoints().get(i).getY(), (int) fig.getPoints().get(i + 1).getX(), (int) fig.getPoints().get(i + 1).getY());
            }
            gr.drawLine((int) fig.getPoints().get(0).getX(), (int) fig.getPoints().get(0).getY(), (int) fig.getPoints().get(fig.getPoints().size() - 1).getX(), (int) fig.getPoints().get(fig.getPoints().size() - 1).getY());
        }}
//    gr.setColor(new Color(255,0,0));
//    gr.fillOval(0,0,300,300);
//    gr.setColor(Color.green);
//    gr.clearRect(50,50,40,50);
//    gr.drawPolyline();
    }
}

