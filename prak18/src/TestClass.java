import T4.Calculator;
import T4.MinMax;
import T5.Matrix;
public class TestClass {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        integers[0] = 22; integers[1] = 12; integers[2] = 54; integers[3] = 72; integers[4] = 1;
        integers[5] = 22; integers[6] = 120; integers[7] = 48; integers[8] = 97; integers[9] = 21;
        Double od = 43.2;
        MinMax<Integer> minmax = new MinMax<>(integers);
        System.out.println(minmax.min());
        System.out.println(minmax.max());
        System.out.println(Calculator.multiply(82.3,19.4));
        Number[][] matrix01 = new Integer[2][2];
        Number[][] matrix02 = new Double[2][2];
        Number[][] matrix0r = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix01[i][j] = integers[i*2+j];

                matrix02[i][j] = od;
                matrix0r[i][j] = 0.0;
            }
        }
        Matrix matrix1 = new Matrix(matrix01);
        Matrix matrix2 = new Matrix(matrix02);
        Matrix matrixr = new Matrix(matrix0r);
        matrix1.subtraction(matrix2,matrixr);
        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrixr);
    }

}
