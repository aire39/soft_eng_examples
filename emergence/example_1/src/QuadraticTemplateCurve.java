import java.util.Vector;

public class QuadraticTemplateCurve extends TemplateCurve {
    @Override
    public void CreateCurve(Vector<Point2D> new_positions, float step) {
        if (new_positions.size() > 2) {
            for (int i = 0; i < (new_positions.size() - 2); i++) {
                for (float k = 0.0f; k <= 1.0f; k += step) {
                    Point2D new_point_0 = linearcurve(new_positions.get(i), new_positions.get(i + 1), k);
                    Point2D new_point_1 = linearcurve(new_positions.get(i + 1), new_positions.get(i + 2), k);
                    Point2D new_point_result = linearcurve(new_point_0, new_point_1, k);
                    positions.add(new_point_result);
                }
            }
        }
    }
}
