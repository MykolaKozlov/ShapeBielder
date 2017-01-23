package abstraction;

import interfaces.BuildOfShape;
import shapes.Point;

import java.util.ArrayList;

public abstract class Shape implements BuildOfShape {

    private ArrayList<Point> allCoordinatesOfShape;

    private int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

    private ArrayList<Point> coordinatesOfTop;

    public Shape() {

    }

    public Shape(ArrayList<Point> coordinatesOfTop) {
        this.coordinatesOfTop = coordinatesOfTop;
        allCoordinatesOfShape = new ArrayList<>();
    }

    private int sign(int x) {
        return (x > 0) ? 1 : (x < 0) ? -1 : 0;
    }

    public void bresenhamLine(int xstart, int ystart, int xend, int yend) {

        dx = xend - xstart;
        dy = yend - ystart;

        incx = sign(dx);

        incy = sign(dy);

        if (dx < 0) {
            dx = -dx;
        }
        if (dy < 0) {
            dy = -dy;
        }

        if (dx > dy) {
            pdx = incx;
            pdy = 0;
            es = dy;
            el = dx;
        } else {
            pdx = 0;
            pdy = incy;
            es = dx;
            el = dy;
        }

        x = xstart;
        y = ystart;
        allCoordinatesOfShape.add(new Point(x, y));


        err = el / 2;

        for (int t = 0; t < el; t++) {
            err -= es;
            if (err < 0) {
                err += el;
                x += incx;
                y += incy;
                allCoordinatesOfShape.add(new Point(x, y));
            } else {
                x += pdx;
                y += pdy;
                allCoordinatesOfShape.add(new Point(x, y));
            }
        }
    }

    public void printCoordinates(ArrayList<Point> list) {
        for (Point point : list) {
            System.out.println(point.toString());
        }
    }

    @Override
    public ArrayList<Point> getCoordinatesOfShape(Shape shape) {
        return null;
    }

    public ArrayList<Point> getCoordinatesOfTop() {
        return coordinatesOfTop;
    }

    public ArrayList<Point> getAllCoordinatesOfShape() {
        return allCoordinatesOfShape;
    }

    public void setCoordinatesOfTop(ArrayList<Point> coordinatesOfTop) {
        this.coordinatesOfTop = coordinatesOfTop;
    }
}
