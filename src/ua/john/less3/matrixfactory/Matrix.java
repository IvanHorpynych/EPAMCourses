package ua.john.less3.matrixfactory;

public class Matrix {

    private int[][] a;

    public Matrix(int i, int j) {
        a = new int[i][j];
    }

    public int getElement(int i, int j){
        return a[i][j];
    }

    public void setElement(int i, int j, int data){
        a[i][j] = data;
    }

    public int getHorizontalSize() {
        return a[1].length;
    }

    public int getVerticalSize() {
        return a.length;
    }

    @Override
    public String toString() {
        String matrix = "";
        for(int [] arr: a){
            for(int elem: arr){
                matrix+=" "+elem;
            }
            matrix+="\n";
        }
        return matrix;
    }

}
