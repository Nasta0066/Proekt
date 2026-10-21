package model;

import java.awt.Graphics2D;
import java.awt.Shape;

public class Solid implements FillBehavior {
    @Override
    public void drawShape(Graphics2D g2, Shape shape) {
        g2.fill(shape);
    }
}