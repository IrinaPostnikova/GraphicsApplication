package com.company.figures;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setTitle("My window");    // Устанавливаем заголовок окна отображения
        setSize(1200, 600);    // Устанавливаем размер отображения окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Можно ли закрыть заданное окно
        JLabel jl = new JLabel("Надпись какая-то");    // Создаем этикетку
        Container c = getContentPane();    // Получаем панель содержимого текущего окна
        c.add(jl);    // Добавляем компонент метки в панель содержимого
        setVisible(true);    // Устанавливаем, видно ли окно
    }
}



