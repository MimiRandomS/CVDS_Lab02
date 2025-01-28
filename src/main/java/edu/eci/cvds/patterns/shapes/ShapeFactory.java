package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;

public class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        if (type == RegularShapeType.Triangle) {
            return new Triangle();
        } else if (type == RegularShapeType.Hexagon) {
            return new Hexagon();
        } else if (type == RegularShapeType.Pentagon) {
            return new Pentagon();
        } else if (type == RegularShapeType.Quadrilateral) {
            return new Quadrilateral();
        } else {
            return null;
        }
    }
}
