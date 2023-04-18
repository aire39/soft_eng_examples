import java.util.Vector;

public class CurveLessDup {
    Vector<Point2D> positions = new Vector<>();

    private Point2D linearcurve(Point2D pos_0, Point2D pos_1, float step) {
        Point2D sub_pos = pos_1.Sub(pos_0);
        return pos_0.Add(sub_pos.Multiply(step));
    }
    void CreateLinearCurve(Point2D pos_0, Point2D pos_1, float step) {
        positions.clear();
        for (float i=0.0f; i<=1.0f; i+=step) {
            Point2D new_point = linearcurve(pos_0, pos_1, i);
            positions.add(new_point);
        }
    }

    void CreateQuadraticCurve(Point2D pos_0, Point2D pos_1, Point2D pos_2, float step) {
        positions.clear();

        for (float i=0.0f; i<=1.0f; i+=step) {
            Point2D new_point_0 = linearcurve(pos_0, pos_1, i);
            Point2D new_point_1 = linearcurve(pos_1, pos_2, i);
            Point2D new_point_result = linearcurve(new_point_0, new_point_1, i);
            positions.add(new_point_result);
        }
    }

    void PrintLocations() {
        for (Point2D p : positions) {
            System.out.println("Curve Point: (" + p.x + "," + p.y + ")");
        }
    }
}
