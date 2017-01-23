package interfaces;

import abstraction.Shape;
import shapes.Point;

import java.util.ArrayList;

public interface BuildOfShape {

    ArrayList<Point> getCoordinatesOfShape(Shape shape);
}
