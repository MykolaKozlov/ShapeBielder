import abstraction.Shape;
import shapes.Point;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> lineCoordinates = new ArrayList<>();
        lineCoordinates.add(new Point(10, 10));
        lineCoordinates.add(new Point(20, 20));

        ArrayList<Point> triangleCoordinates = new ArrayList<>();
        triangleCoordinates.add(new Point(10, 10));
        triangleCoordinates.add(new Point(20, 20));
        triangleCoordinates.add(new Point(15, 5));


        Shape line = new shapes.Line(lineCoordinates);

        System.out.println("Coordinates of line:");
        line.printCoordinates(line.getCoordinatesOfShape(line));


        Shape triangle = new shapes.Triangle(triangleCoordinates);

        System.out.println("Coordinates of triangle:");
        triangle.printCoordinates(triangle.getCoordinatesOfShape(triangle));
    }
}
