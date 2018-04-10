package ua.john.less3.matrixfactory;

public class MatrixLogic {

    public static Matrix sumMatrix(Matrix first, Matrix second) {
        if (!(first.getHorizontalSize() == second.getHorizontalSize() && first.getVerticalSize() == second.getVerticalSize())) {
            System.out.println("sizes both matrix not equals");
            throw new NullPointerException();
        }
        Matrix matrix = new Matrix(first.getVerticalSize(), first.getHorizontalSize());
        for (int i = 0; i < first.getVerticalSize(); i++) {
            for (int j = 0; j < first.getHorizontalSize(); j++) {
                matrix.setElement(i, j, first.getElement(i, j) + second.getElement(i, j));
            }
        }
        return matrix;

    }
}
