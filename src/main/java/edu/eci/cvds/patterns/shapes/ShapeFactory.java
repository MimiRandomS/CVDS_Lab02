package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;

public class ShapeFactory {
    public static Shape createShape(RegularShapeType type) {
        if (type == RegularShapeType.TRIANGLE) {
            return new Triangle();
        } else if (type == RegularShapeType.HEXAGON) {
            return new Hexagon();
        } else if (type == RegularShapeType.PENTAGON) {
            return new Pentagon();
        } else if (type == RegularShapeType.QUADRILATERAL) {
            return new Quadrilateral();
        } else {
            return null;
        }
    }
}
