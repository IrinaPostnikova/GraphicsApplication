package com.company.swing;

import com.company.figures.Circle;
import com.company.figures.Figure;
import com.company.figures.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphicPanel extends JPanel {

    private ArrayList<Figure> figures;
    //    public int multiplierX;
//    public int multiplierY;
    private Color figuresColor = new Color(0xFD23C3);

    public GraphicPanel(ArrayList<Figure> figures) {
        super();
        this.figures = figures;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int width = this.getWidth();
        int height = this.getHeight();
        int startX = 0;
        int startY = 0;
        Graphics canvas = g.create(startX, startY, width, height);
        canvas.setColor(new Color(0xF6E7E7));
        canvas.fillRect(0, 0, width, height);
        if (figures.size() > 0) {
            double minX = figures.get(0).getPoints().get(0).getX();
            double maxX = Math.abs(figures.get(0).getPoints().get(0).getX());
            double minY = figures.get(0).getPoints().get(0).getY();
            double maxY = Math.abs(figures.get(0).getPoints().get(0).getY());
            for (Figure figure : figures) {
                for (Point point : figure.getPoints()) {
                    if (point.getX() < minX) minX = point.getX();
                    if (point.getX() > maxX) maxX = point.getX();
                    if (point.getY() < minY) minY = point.getX();
                    if (point.getY() > maxY) maxY = point.getX();
                }
            }
        }
        drawGrid(canvas, width, height);
        drawAxis(canvas, width, height);
        drawFigures(canvas, width, height);
    }

    public void drawFigures(Graphics canvas, int width, int height) {
        canvas.setColor(figuresColor);
        BasicStroke str = (new BasicStroke(3));
        Graphics2D g2 = (Graphics2D) canvas;
        g2.setStroke(str);

        if (figures != null) {
            for (var fig : figures) {
                int x0 = (int) fig.getPoints().get(0).getX();
                int y0 = (int) fig.getPoints().get(0).getY();
                if (fig.getPoints().size() == 2) {
                    int radius = (int) ((Circle) fig).getRadius();
                    canvas.drawOval(x0 + width / 2, height / 2 - y0, radius * 2, radius * 2);
                } else {
                    int lastX = (int) fig.getPoints().get(fig.getPoints().size() - 1).getX();
                    int lastY = (int) fig.getPoints().get(fig.getPoints().size() - 1).getY();
                    for (int i = 0; i < fig.getPoints().size() - 1; i++) {
                        int x1 = (int) fig.getPoints().get(i).getX();
                        int x2 = (int) fig.getPoints().get(i + 1).getX();
                        int y1 = (int) fig.getPoints().get(i).getY();
                        int y2 = (int) fig.getPoints().get(i + 1).getY();
                        canvas.drawLine(x1 + width / 2, height / 2 - y1, x2 + width / 2, height / 2 - y2);
                    }
                    canvas.drawLine(x0 + width / 2, height / 2 - y0, lastX + width / 2, height / 2 - lastY);
                }
            }
        }
    }

    public void drawAxis(Graphics canvas, int width, int height) {
        canvas.setColor(new Color(0x000000));
        canvas.drawLine(width / 2, 0, width / 2, height);
        canvas.drawLine(0, height / 2, width, height / 2);
    }

    public void drawGrid(Graphics canvas, int width, int height) {
        canvas.setColor(new Color(0xC9C8C8));
        for (int x = width / 2; x < width; x += 20) {
            canvas.drawLine(x, 0, x, height);
        }
        for (int x = width / 2; x > 0; x -= 20) {
            canvas.drawLine(x, 0, x, height);
        }
        for (int y = height / 2; y < height; y += 20) {
            canvas.drawLine(0, y, width, y);
        }
        for (int y = height / 2; y > 0; y -= 20) {
            canvas.drawLine(0, y, width, y);
        }
    }

    public void repaintGraphics(ArrayList<Figure> figures) {
        this.figures = figures;
        this.repaint();
        this.revalidate();

    }
}


