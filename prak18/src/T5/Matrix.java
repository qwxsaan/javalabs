package T5;
import T4.Calculator;
public class Matrix <N extends Number> {
    private N[][] nMatrix;
    private int lengthy;
    private int lengthx;
    public Matrix(N[][] nMatrix) {
        this.nMatrix = nMatrix;
        lengthy = nMatrix.length;
        if (lengthy > 0)
            lengthx = nMatrix[0].length;
    }
    public void sum(Matrix matrix0, Matrix matrixr) {
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                matrixr.nMatrix[i][j] = Calculator.sum(matrix0.nMatrix[i][j], nMatrix[i][j]);
            }
        }
    }
    public void subtraction(Matrix matrix0, Matrix matrixr) {
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                matrixr.nMatrix[i][j] = Calculator.subtraction(nMatrix[i][j], matrix0.nMatrix[i][j]);
            }
        }
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                result += nMatrix[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

}
