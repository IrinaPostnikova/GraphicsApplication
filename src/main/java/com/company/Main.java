package com.company;

import com.company.figures.Figure;
import com.company.swing.GraphicApp;
import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        GraphicApp app = new GraphicApp(new ArrayList<Figure>());
        app.showFrame();
    }
}