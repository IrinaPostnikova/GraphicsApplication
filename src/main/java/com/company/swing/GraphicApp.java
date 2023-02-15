package com.company.swing;

import com.company.factory.FigureCreator;
import com.company.figures.Figure;
import com.company.figures.Point;
import lombok.SneakyThrows;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;

import static com.company.json.Json.readFromFileJson;
import static com.company.json.Json.writeToFileJson;

public class GraphicApp extends JFrame {
    private JFrame frame;
    private JLabel statusLabel;
    private JTextField xCoordinate;
    private JTextField yCoordinate;
    private GraphicPanel graphicPanel;
    private ArrayList<Figure> figures;
    private ArrayList<Figure> chosenFigure;
    private Graphics canvas;
    private JList<String> listPoints;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    boolean chooseFigure = false;
    private Figure activeFigure = null;
    private JPanel bottomPanel;
    private Box panel;
    private Box upperPanel;
    private JMenu figuresMenu;
    private JButton butMoveFig;
    private JButton butScaleFig;
    private JButton butRotateFig;
    private JLabel rotateFigureJLabel;
    private JTextField rotateTextField;
    private JButton buttonRotateFigure;
    private JLabel title;
    private JLabel xcoordLabel;
    private JLabel ycoordLabel;
    private JButton buttonAddPoint;
    private JButton buttonDeletePoint;
    private JButton buttonCreateFigure;
    private JButton buttonDeleteFigure;
    private JLabel moveFigureJLabel;
    private JTextField moveTextFieldX;
    private JTextField moveTextFieldY;
    private JButton buttonMoveFigure;
    private JLabel scaleFigureJLabel;
    private JTextField scaleTextField;
    private JButton buttonScaleFigure;

    public GraphicApp(ArrayList<Figure> figures) {
        this.figures = figures;
        createFrame();
        createFrameElements();
    }

    public void createFrame() {
        this.frame = new JFrame("Графическое приложение");
        this.frame.setSize(800, 600);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showFrame() {
        this.frame.setVisible(true);    // Устанавливаем, видно ли окно
    }

    public void createFrameElements() {
        Container mainContainer = frame.getContentPane();
        mainContainer.setLayout(new BorderLayout());

        Box leftPanel = createLeftPanel();
        mainContainer.add(leftPanel, BorderLayout.WEST);

        upperPanel = createUpperPanel();
        mainContainer.add(upperPanel, BorderLayout.NORTH);

        JMenuBar menuBar = createJMenuBar();
        this.frame.setJMenuBar(menuBar);

        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.red);
        mainContainer.add(bottomPanel, BorderLayout.SOUTH);
        statusLabel = new JLabel();
        bottomPanel.add(statusLabel);
        bottomPanel.setVisible(false);
        statusLabel.setVisible(false);

        this.graphicPanel = new GraphicPanel(this.figures);
        graphicPanel.setVisible(false);
        this.graphicPanel.setBackground(new Color(0xFFFFFF));
        mainContainer.add(this.graphicPanel);

        graphicPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chosenFigure = new ArrayList<Figure>();
                int x = e.getX() - graphicPanel.getWidth() / 2;
                int y = graphicPanel.getHeight() / 2 - e.getY();

                activeFigure = defineFigureByCursor(x, y, figures);
                System.out.println(activeFigure);
                System.out.println(x + "  " + y);
                chosenFigure.add(activeFigure);

                System.out.println(chosenFigure);
                if (chooseFigure && activeFigure != null) {
                    butMoveFig.setEnabled(true);
                    butRotateFig.setEnabled(true);
                    butScaleFig.setEnabled(true);
                    buttonDeleteFigure.setEnabled(true);
                    graphicPanel.repaintGraphics(chosenFigure);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public Box createUpperPanel() {
        upperPanel = Box.createHorizontalBox();
        upperPanel.setVisible(false);

        JButton buttonChooseFigure = new JButton("Выбрать фигуру");
        buttonChooseFigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                chooseFigure = true;
            }
        });
        upperPanel.add(buttonChooseFigure);


        butRotateFig = new JButton("Повернуть фигуру");
        butRotateFig.setEnabled(false);
        butRotateFig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                rotateFigureJLabel.setVisible(true);
                rotateTextField.setVisible(true);
                buttonRotateFigure.setVisible(true);

                title.setVisible(false);
                xcoordLabel.setVisible(false);
                xCoordinate.setVisible(false);
                ycoordLabel.setVisible(false);
                yCoordinate.setVisible(false);
                scrollPane.setVisible(false);

                buttonAddPoint.setVisible(false);
                buttonDeletePoint.setVisible(false);
                buttonCreateFigure.setVisible(false);

                scaleFigureJLabel.setVisible(false);
                scaleTextField.setVisible(false);
                buttonScaleFigure.setVisible(false);

                moveFigureJLabel.setVisible(false);
                moveTextFieldX.setVisible(false);
                moveTextFieldY.setVisible(false);
                buttonMoveFigure.setVisible(false);
            }
        });
        upperPanel.add(butRotateFig);

        butScaleFig = new JButton("Изменить размер фигуры");
        butScaleFig.setEnabled(false);
        butScaleFig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                scaleFigureJLabel.setVisible(true);
                scaleTextField.setVisible(true);
                buttonScaleFigure.setVisible(true);

                title.setVisible(false);
                xcoordLabel.setVisible(false);
                xCoordinate.setVisible(false);
                ycoordLabel.setVisible(false);
                yCoordinate.setVisible(false);
                scrollPane.setVisible(false);
                buttonAddPoint.setVisible(false);
                buttonDeletePoint.setVisible(false);
                buttonCreateFigure.setVisible(false);

                rotateFigureJLabel.setVisible(false);
                rotateTextField.setVisible(false);
                buttonRotateFigure.setVisible(false);

                moveFigureJLabel.setVisible(false);
                moveTextFieldX.setVisible(false);
                moveTextFieldY.setVisible(false);
                buttonMoveFigure.setVisible(false);
            }
        });
        upperPanel.add(butScaleFig);

        butMoveFig = new JButton("Переместить фигуру");
        butMoveFig.setEnabled(false);
        butMoveFig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                moveFigureJLabel.setVisible(true);
                moveTextFieldX.setVisible(true);
                moveTextFieldY.setVisible(true);
                buttonMoveFigure.setVisible(true);

                title.setVisible(false);
                xcoordLabel.setVisible(false);
                xCoordinate.setVisible(false);
                ycoordLabel.setVisible(false);
                yCoordinate.setVisible(false);
                scrollPane.setVisible(false);
                buttonAddPoint.setVisible(false);
                buttonDeletePoint.setVisible(false);
                buttonCreateFigure.setVisible(false);
                scaleFigureJLabel.setVisible(false);
                scaleTextField.setVisible(false);
                buttonScaleFigure.setVisible(false);
                rotateFigureJLabel.setVisible(false);
                rotateTextField.setVisible(false);
                buttonRotateFigure.setVisible(false);

            }
        });
        upperPanel.add(butMoveFig);

        buttonDeleteFigure = new JButton("Удалить фигуру");
        buttonDeleteFigure.setEnabled(false);
        buttonDeleteFigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                chosenFigure.remove(activeFigure);
                figures.remove(activeFigure);
                graphicPanel.repaintGraphics(figures);
            }
        });
        upperPanel.add(buttonDeleteFigure);

        return upperPanel;
    }

    public Box createLeftPanel() {
        panel = Box.createVerticalBox();


        title = new JLabel("Создать фигуру");
        title.setVisible(false);


        panel.add(title);

        panel.setVisible(false);

        xcoordLabel = new JLabel("Введите х точки");
        xcoordLabel.setVisible(false);
        panel.add(xcoordLabel);

        xCoordinate = new JTextField();
        xCoordinate.setVisible(false);
        xCoordinate.setMaximumSize(new Dimension(120, 40));
        panel.add(xCoordinate);


        ycoordLabel = new JLabel("Введите y точки");
        panel.add(ycoordLabel);
        ycoordLabel.setVisible(false);
        yCoordinate = new JTextField();//поле ввода точки y
        yCoordinate.setVisible(false);
        yCoordinate.setMaximumSize(new Dimension(120, 40));
        panel.add(yCoordinate);

        // создаем JList
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        listPoints = new JList<>(listModel);
        scrollPane = new JScrollPane(listPoints);
        scrollPane.setVisible(false);
        scrollPane.setSize(new Dimension(120, 20));
        listPoints.setLayoutOrientation(JList.VERTICAL_WRAP);

        panel.add(scrollPane);

        buttonAddPoint = new JButton("Добавить точку");
        buttonAddPoint.setVisible(false);
        buttonAddPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bottomPanel.setVisible(false);
                statusLabel.setVisible(false);
                String point = xCoordinate.getText() + "; " + yCoordinate.getText();
                listModel.addElement(point);
                xCoordinate.setText(null);
                yCoordinate.setText(null);
            }
        });
        panel.add(buttonAddPoint);

        buttonDeletePoint = new JButton("Удалить точку");
        buttonDeletePoint.setVisible(false);
        buttonDeletePoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listModel.size() != 0) {
                    listModel.removeElement(listPoints.getSelectedValue());
                } else {
                    bottomPanel.setVisible(true);
                    statusLabel.setVisible(true);
                    statusLabel.setText("Вы не добавили координаты точек");
                }
            }
        });

        panel.add(buttonDeletePoint);


        buttonCreateFigure = new JButton("Создать фигуру");
        buttonCreateFigure.setVisible(false);
        buttonCreateFigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                figuresMenu.setVisible(true);

                ArrayList<Point> points = new ArrayList<>();
                ListModel<String> listModelPoint = listPoints.getModel();
                if (listModelPoint.getSize() < 2) {
                    bottomPanel.setVisible(true);
                    statusLabel.setVisible(true);
                    statusLabel.setText("Вы не добавили координаты точек");

                } else {
                    bottomPanel.setVisible(false);
                    statusLabel.setVisible(false);

                    for (int i = 0; i < listModelPoint.getSize(); i++) {
                        String[] vectorPoints = listModelPoint.getElementAt(i).split(";");
                        points.add(new Point((Double.parseDouble(vectorPoints[0])), (Double.parseDouble(vectorPoints[1]))));
                    }
                    for (var p : points) {
                        System.out.println(p);
                    }
                    FigureCreator figureCreator = new FigureCreator();
                    Figure newFigure = figureCreator.create(points);
                    figures.add(newFigure);
                    for (var fig : figures) {
                        System.out.println(fig);
                    }
                    graphicPanel.repaintGraphics(figures);
                    listModel.removeAllElements();
                }
            }
        });
        panel.add(buttonCreateFigure);

        rotateFigureJLabel = new JLabel("Введите угол поворота");
        panel.add(rotateFigureJLabel);
        rotateFigureJLabel.setVisible(false);
        rotateTextField = new JTextField();
        rotateTextField.setVisible(false);
        rotateTextField.setMaximumSize(new Dimension(120, 20));
        panel.add(rotateTextField);

        buttonRotateFigure = new JButton("Повернуть фигуру");
        buttonRotateFigure.setVisible(false);
        buttonRotateFigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(rotateTextField.getText());
                chosenFigure.remove(activeFigure);

                activeFigure.rotate(a);

                chosenFigure.add(activeFigure);

                graphicPanel.repaintGraphics(chosenFigure);
            }
        });

        panel.add(buttonRotateFigure);

        moveFigureJLabel = new JLabel("Введите координаты");
        moveFigureJLabel.setVisible(false);
        panel.add(moveFigureJLabel);

        moveTextFieldX = new JTextField();
        moveTextFieldX.setVisible(false);

        moveTextFieldY = new JTextField();
        moveTextFieldY.setVisible(false);

        moveTextFieldX.setMaximumSize(new Dimension(120, 20));
        panel.add(moveTextFieldX);

        moveTextFieldY.setMaximumSize(new Dimension(120, 20));
        panel.add(moveTextFieldY);

        buttonMoveFigure = new JButton("Переместить фигуру");
        buttonMoveFigure.setVisible(false);
        buttonMoveFigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(moveTextFieldX.getText());
                double y = Double.parseDouble(moveTextFieldY.getText());

                chosenFigure.remove(activeFigure);
                activeFigure.move(new Point(x, y));

                chosenFigure.add(activeFigure);

                graphicPanel.repaintGraphics(chosenFigure);

            }
        });

        panel.add(buttonMoveFigure);

        scaleFigureJLabel = new JLabel("Введите кооэффициент масштабирования");
        scaleFigureJLabel.setVisible(false);
        panel.add(scaleFigureJLabel);
        scaleTextField = new JTextField();
        scaleTextField.setVisible(false);
        scaleTextField.setMaximumSize(new Dimension(120, 20));
        panel.add(scaleTextField);

        buttonScaleFigure = new JButton("Изменить фигуру");//масштабирование
        buttonScaleFigure.setVisible(false);
        buttonScaleFigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(scaleTextField.getText());
                activeFigure.scale((int) a);
                chosenFigure.add(activeFigure);
                graphicPanel.repaintGraphics(chosenFigure);
            }
        });
        panel.add(buttonScaleFigure);


        return panel;
    }

    public Figure defineFigureByCursor(int x, int y, ArrayList<Figure> figures) {
        for (Figure f : figures) {
            if (f.containPoint(x, y))
                return f;
        }
        return null;
    }

    private JMenuBar createJMenuBar() {
        menuBar = new JMenuBar();
        JMenu file = new JMenu("Файл");
        file.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                upperPanel.setVisible(false);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });
        figuresMenu = new JMenu("Фигура");
        figuresMenu.setVisible(false);
        figuresMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                upperPanel.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        menuBar.add(file);
        menuBar.add(figuresMenu);
        JMenu create = new JMenu("Создать");
        create.setIcon(new ImageIcon("create.png"));
        JMenuItem figure = new JMenuItem("Фигуру");
        figure.setIcon(new ImageIcon("fig.png"));
        figure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                graphicPanel.setVisible(true);
                panel.setVisible(true);
                title.setVisible(true);
                panel.setVisible(true);
                xcoordLabel.setVisible(true);
                xCoordinate.setVisible(true);
                ycoordLabel.setVisible(true);
                yCoordinate.setVisible(true);
                scrollPane.setVisible(true);
                buttonAddPoint.setVisible(true);
                buttonDeletePoint.setVisible(true);
                buttonCreateFigure.setVisible(true);
                scaleFigureJLabel.setVisible(false);
                scaleTextField.setVisible(false);
                buttonScaleFigure.setVisible(false);
                moveFigureJLabel.setVisible(false);
                moveTextFieldX.setVisible(false);
                moveTextFieldY.setVisible(false);
                buttonMoveFigure.setVisible(false);
            }
        });
        file.add(create);
        create.add(figure);
        JMenu open = new JMenu("Открыть");
        JMenuItem fileJson = new JMenuItem("JSON-файл");
        open.setIcon(new ImageIcon("open.png"));
        fileJson.addActionListener(new ActionListener() {
            @Override
            @SneakyThrows
            public void actionPerformed(ActionEvent e) {
                figuresMenu.setVisible(true);
                graphicPanel.setVisible(true);
                try {
                    readFromFileJson("jsonForGraph");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                figures.addAll(readFromFileJson("jsonForGraph"));
                graphicPanel.repaintGraphics(readFromFileJson("jsonForGraph"));
            }
        });
        file.add(open);
        open.add(fileJson);
        JMenuItem save = new JMenuItem("Сохранить");
        save.setIcon(new ImageIcon("save.png"));
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    writeToFileJson(figures, "jsonForGraph");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        file.add(save);
        JMenuItem saveAs = new JMenuItem("Cохранить как..");
        saveAs.setIcon(new ImageIcon("saveas.png"));
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedImage bi = new BufferedImage(graphicPanel.getWidth(), graphicPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D cg = bi.createGraphics();
                graphicPanel.paintAll(cg);
                try {
                    if (ImageIO.write(bi, "png", new File("./output_image.png"))) {
                        System.out.println("-- saved");
                    }
                } catch (IOException r) {
                    r.printStackTrace();
                }
            }
        });
        file.add(saveAs);
        JMenuItem exit = new JMenuItem("Выход");
        exit.setIcon(new ImageIcon("exit.png"));
        exit.addActionListener(e -> {
            System.exit(0);
        });
        file.add(exit);
        file.add(new JSeparator());
        return menuBar;
    }
}



