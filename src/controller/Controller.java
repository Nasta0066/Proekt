package controller;


import view.MyFrame;
import view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Controller {

    MyPanel myPanel;
    MyFrame myFrame;
    Point2D[] points;
    Rectangle2D rectangle2D;
    Ellipse2D ellipse2D;
    RectangularShape currentShape;

    public Controller() {
        rectangle2D = new Rectangle2D.Double();
        ellipse2D = new Ellipse2D.Double();
        currentShape = rectangle2D;
        points = new Point2D[2];
        myPanel = new MyPanel(this);
        myFrame = new MyFrame(myPanel);
    }



    public void toggleShapeAction() {
        if (currentShape == rectangle2D) {
            currentShape = ellipse2D;
        } else {
            currentShape = rectangle2D;
        }
        points[0] = null;
        points[1] = null;
    }

    public String getCurrentShapeName() {
        if (currentShape == rectangle2D) {
            return "Pramougolnik";
        } else {
            return "Oval";
        }
    }

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void mouseDragged(Point point) {
        points[1] = point;
    }

    public void draw(Graphics2D g2) {
        if (points[0] != null && points[1] != null) {
            currentShape.setFrameFromDiagonal(points[0], points[1]);
            g2.draw(currentShape);
        }
    }
}