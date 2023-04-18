import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Bezier Curves: https://en.wikipedia.org/wiki/B%C3%A9zier_curve
        // Step - How many steps/points between the 1st and 2nd point (excluding anchor point)

        System.out.println("Linear CurveLessDup with Step 0.5\n");
        CurveLessDup curve = new CurveLessDup();
        curve.CreateLinearCurve(new Point2D(0.0f, 0.0f), new Point2D(1.0f, 1.0f), 0.5f);
        curve.PrintLocations();

        System.out.println("\nQuadratic CurveLessDup with Step 0.1\n");

        Point2D anchor_point = new Point2D(1.0f, 0.0f);
        curve.CreateQuadraticCurve(new Point2D(0.0f, 0.0f), anchor_point, new Point2D(1.0f, 1.0f), 0.1f);
        curve.PrintLocations();

        System.out.println("\nLinear Template with Step 0.5\n");

        Vector<Point2D> linear_curve_points = new Vector<>();
        linear_curve_points.add(new Point2D(0.0f, 0.0f));
        linear_curve_points.add(new Point2D(1.0f, 1.0f));

        LinearTemplateCurve template_lin_curve = new LinearTemplateCurve();
        template_lin_curve.SetPositions(linear_curve_points, 0.5f);
        template_lin_curve.PrintLocations();

        System.out.println("\nLinear Template with Step 0.1\n");

        template_lin_curve.SetPositions(linear_curve_points, 0.1f);
        template_lin_curve.PrintLocations();

        System.out.println("\nQuadratic Template with Step 0.1\n");

        Vector<Point2D> quad_curve_points = new Vector<>();
        quad_curve_points.add(new Point2D(0.0f, 0.0f));
        quad_curve_points.add(new Point2D(1.0f, 0.0f));
        quad_curve_points.add(new Point2D(1.0f, 1.0f));

        QuadraticTemplateCurve template_quad_curve = new QuadraticTemplateCurve();
        template_quad_curve.SetPositions(quad_curve_points, 0.1f);
        template_quad_curve.PrintLocations();
    }
}