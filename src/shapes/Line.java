package shapes;

import abstraction.Shape;

import java.util.ArrayList;

public class Line extends Shape {

    public Line() {

    }

    public Line(ArrayList<Point> coordinatesOfTop) {
        super(coordinatesOfTop);
    }

    @Override
    public ArrayList<Point> getCoordinatesOfShape(Shape shape) {

        bresenhamLine(shape.getCoordinatesOfTop().get(0).getX(), shape.getCoordinatesOfTop().get(0).getY(), shape.getCoordinatesOfTop().get(1).getX(), shape.getCoordinatesOfTop().get(1).getY());

        return super.getAllCoordinatesOfShape();
    }
}
