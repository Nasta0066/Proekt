package model;

import java.awt.Graphics2D;
import java.awt.Shape;

public interface FillBehavior {
    void drawShape(Graphics2D g2, Shape shape);
}