package com.company.json;

import com.company.figures.Figure;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;

@JsonAutoDetect
public class FigureList {
    public ArrayList<Figure> figures;

}
