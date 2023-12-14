package pr2;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void summcifr(){
        int[]m=new int[]{1,2,3,4,5,6,7,8,9,10};
        int s=0;
        for (int i=0;i<m.length;i++){
            s+=m[i];
        }
        System.out.println(s);
        s = 0;
        int k=0;
        while (k<m.length){
            s+=m[k];
            k++;
        }
        System.out.println(s);
        s=0;
        k=0;
        do {
            s+=m[k];
            k++;
        }while(k<m.length);
        System.out.println(s);



    }
    public static void calculateSum() {
        double s = 0;
        for (int i = 1; i <= 10; i++) {
            s = 1.0 / i;
            System.out.println(s);
        }
    }

    public static void gen() {
        int[] arr = generateRandomArray(10);
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // генерируем случайное число от 0 до 99
        }
        return arr;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
        summcifr();
        calculateSum();
        gen();
        System.out.println(factorial(5));


    }
}
