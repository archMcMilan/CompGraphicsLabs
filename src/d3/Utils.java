package d3;

/**
 * Created by Artem on 27.12.16.
 */
public class Utils {
    public static double[][] multiply(double[][] a, double[][] b) {

        int aRows = a.length;
        int aColumns = a[0].length;
        int bRows = b.length;
        int bColumns = b[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        double[][] c = new double[aRows][bColumns];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = 0.00000;
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static double[][] rotateMatrixFactory(String axis, double rotateDegree) throws Exception {
        rotateDegree =Math.toRadians(rotateDegree);

        switch (axis) {
            case "X" : {
                return new double[][]  {
                        {1, 0, 0, 0},
                        {0, Math.cos(rotateDegree), Math.sin(rotateDegree), 0},
                        {0, -Math.sin(rotateDegree), Math.cos(rotateDegree), 0},
                        {0, 0, 0, 1}
                };
            }
            case "Y" : {
                return new  double[][]  {
                        {Math.cos(rotateDegree), 0, -Math.sin(rotateDegree), 0},
                        {0, 1, 0, 0},
                        {Math.sin(rotateDegree), 0, Math.cos(rotateDegree), 0},
                        {0, 0, 0, 1}
                };
            }
            case "Z" : {
                return new double[][]  {
                        {Math.cos(rotateDegree), Math.sin(rotateDegree), 0, 0},
                        {-Math.sin(rotateDegree), Math.cos(rotateDegree), 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 1}
                };
            }
            default: {
                throw new Exception();
            }
        }
    }
}
