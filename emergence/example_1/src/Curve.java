import java.util.Vector;

public class Curve {
    Vector<Float> positionXs = new Vector<>();
    Vector<Float> positionYs = new Vector<>();

    void CreateLinearCurve(float x0, float y0, float x1, float y1, float step) {
        for (float i=0.0f; i<=1.0f; i+=step) {
            float pxr = x0 + i * (x1 - x0);
            float pyr = y0 + i * (y1 - y0);

            positionXs.add(pxr);
            positionYs.add(pyr);
        }
    }

    void CreateQuadraticCurve(float x0, float y0, float x1, float y1, float x2, float y2, float step) {
        for (float i=0.0f; i<=1.0f; i+=step) {
            // do linear step for points (x0,y0) and (x1,y1)
            float px1 = x0 + i * (x1 - x0);
            float py1 = y0 + i * (y1 - y0);

            // do linear step for points (x1,y1) and (x2,y2)
            float px2 = x1 + i * (x2 - x1);
            float py2 = y1 + i * (y2 - y1);

            float pxr = px1 + i * (px2 - px1);
            float pyr = py1 + i * (py2 - py1);

            positionXs.add(pxr);
            positionYs.add(pyr);
        }
    }
}
