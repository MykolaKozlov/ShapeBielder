package shapes;

import abstraction.Shape;

import java.util.ArrayList;

public class Triangle extends Shape {

    public Triangle() {

    }

    public Triangle(ArrayList<Point> coordinatesOfTop) {
        super(coordinatesOfTop);
    }

    public void printCoordinates(ArrayList<Point> list) {
        for (Point point : list) {
            System.out.println(point.toString());
        }
    }

    @Override
    public ArrayList<Point> getCoordinatesOfShape(Shape shape) {

        bresenhamLine(shape.getCoordinatesOfTop().get(0).getX(), shape.getCoordinatesOfTop().get(0).getY(), shape.getCoordinatesOfTop().get(1).getX(), shape.getCoordinatesOfTop().get(1).getY());
        bresenhamLine(shape.getCoordinatesOfTop().get(1).getX(), shape.getCoordinatesOfTop().get(1).getY(), shape.getCoordinatesOfTop().get(2).getX(), shape.getCoordinatesOfTop().get(2).getY());
        bresenhamLine(shape.getCoordinatesOfTop().get(2).getX(), shape.getCoordinatesOfTop().get(2).getY(), shape.getCoordinatesOfTop().get(0).getX(), shape.getCoordinatesOfTop().get(0).getY());

        return super.getAllCoordinatesOfShape();
    }
}
