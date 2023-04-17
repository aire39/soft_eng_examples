import java.util.Vector;

public abstract class TemplateCurve {
    Vector<Point2D> positions = new Vector<>();

    protected Point2D linearcurve(Point2D pos_0, Point2D pos_1, float step) {
        Point2D sub_pos = pos_1.Sub(pos_0);
        return pos_0.Add(sub_pos.Multiply(step));
    }

    public void SetPositions(Vector<Point2D> new_positions, float step) {
        positions.clear();
        CreateCurve(new_positions, step);
    }
    protected abstract void CreateCurve(Vector<Point2D> new_positions, float step);

    public void PrintLocations() {
        for (Point2D p : positions) {
            System.out.println("Curve Point: (" + p.x + "," + p.y + ")");
        }
    }
}
