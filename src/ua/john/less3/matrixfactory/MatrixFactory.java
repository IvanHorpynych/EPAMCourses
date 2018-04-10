package ua.john.less3.matrixfactory;

public class MatrixFactory {

    public static Matrix createMatrix(int i, int j) {
        Matrix matrix = new Matrix(i, j);
        try {
            for (int k = 0; k < i; k++) {
                for (int p = 0; p < j; p++) {
                    matrix.setElement(k, p, (int) (Math.random() * 100));
                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return matrix;
    }
}
