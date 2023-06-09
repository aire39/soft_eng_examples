import java.util.Vector;

public class LinearTemplateCurve extends TemplateCurve {
    @Override
    public void CreateCurve(Vector<Point2D> new_positions, float step) {
        if (new_positions.size() > 1) {
            for (int i = 0; i < (new_positions.size() - 1); i++) {
                for (float k = 0.0f; k <= 1.0f; k += step) {
                    Point2D new_point = linearcurve(new_positions.get(i), new_positions.get(i + 1), k);
                    positions.add(new_point);
                }
            }
        }
        else {
            System.out.println("No enough points to create linear curve. Need at least 2 points!");
        }
    }
}
