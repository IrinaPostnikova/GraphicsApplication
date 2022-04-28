package com.company.factory.figures;

import javax.swing.*;
import java.awt.*;

public  class fhddjjd {

        public static void main(String[] args) {
            Panelka pan = new Panelka();
            JFrame frame = new JFrame("Frame");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(pan);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

    }
    class Panelka extends JPanel {
        public void paintComponent(Graphics g){
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, 40, 30);

        }

    }

