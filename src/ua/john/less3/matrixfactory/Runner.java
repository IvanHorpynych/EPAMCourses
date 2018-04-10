package ua.john.less3.matrixfactory;

public class Runner {
    public static void main(String[] args) {
        Matrix matrixFirst = MatrixFactory.createMatrix(2,3);
        Matrix matrixSecond = MatrixFactory.createMatrix(3,3);
        try {
            System.out.println(MatrixLogic.sumMatrix(matrixFirst, matrixSecond));
        } catch (NullPointerException e){
            System.out.println("Error");
        }
    }
}
