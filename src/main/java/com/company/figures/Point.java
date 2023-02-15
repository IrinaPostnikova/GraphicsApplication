package com.company.figures;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


import java.io.Serial;
import java.io.Serializable;
@JsonAutoDetect


public class Point implements Serializable {
    @Serial
   private static final long serialVersionUID=1L;
    public Point() {
    }

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point  " + this.getX() + ";" + this.getY();
    }


}
