import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        CurveLessDup curve = new CurveLessDup();
        curve.CreateLinearCurve(new Point2D(0.0f, 0.0f), new Point2D(1.0f, 1.0f), 0.5f);
        curve.PrintLocations();

        System.out.println("\n");

        Point2D anchor_point = new Point2D(1.0f, 0.0f);
        curve.CreateQuadraticCurve(new Point2D(0.0f, 0.0f), anchor_point, new Point2D(1.0f, 1.0f), 0.1f);
        curve.PrintLocations();

        LinearTemplateCurve template_lin_curve = new LinearTemplateCurve();

        System.out.println("\nLinear with Step 0.5\n");

        Vector<Point2D> curve_points = new Vector<>();
        curve_points.add(new Point2D(0.0f, 0.0f));
        curve_points.add(new Point2D(1.0f, 1.0f));

        template_lin_curve.SetPositions(curve_points, 0.5f);
        template_lin_curve.PrintLocations();

        System.out.println("\nLinear with Step 0.1\n");

        template_lin_curve.SetPositions(curve_points, 0.1f);
        template_lin_curve.PrintLocations();

        System.out.println("\nQuadratic with Step 0.1\n");

        QuadraticTemplateCurve template_quad_curve = new QuadraticTemplateCurve();

        curve_points.get(1).x = 1.0f;
        curve_points.get(1).y = 0.0f;

        curve_points.add(new Point2D(1.0f, 1.0f));
        template_quad_curve.SetPositions(curve_points, 0.1f);

        template_quad_curve.PrintLocations();
    }
}