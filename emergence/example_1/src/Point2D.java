import java.awt.*;

public class Point2D {
    public float x;
    public float y;

    Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D Multiply (Point2D pos) {
        Point2D new_point = new Point2D();
        new_point.x = x * pos.x;
        new_point.y = y * pos.y;

        return new_point;
    }

    public Point2D Multiply (float v) {
        Point2D new_point = new Point2D();
        new_point.x = x * v;
        new_point.y = y * v;

        return new_point;
    }

    public Point2D Add (Point2D pos) {
        Point2D new_point = new Point2D();
        new_point.x = x + pos.x;
        new_point.y = y + pos.y;

        return new_point;
    }

    public Point2D Sub (Point2D pos) {
        Point2D new_point = new Point2D();
        new_point.x = x - pos.x;
        new_point.y = y - pos.y;

        return new_point;
    }
}
