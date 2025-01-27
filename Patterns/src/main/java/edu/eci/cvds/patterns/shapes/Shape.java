package edu.eci.cvds.patterns.shapes;

public interface Shape {
    public int getNumberOfEdges();
}

public enum RegularShapeType {
    Triangle, Quadrilateral, Pentagon, Hexagon
}
