package task2;
import java.util.Scanner;
public class Exception21 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
}
// Qwerty: исключение NumberFormatException
// 0: исключение ArithmeticException
// 1.2: исключение NumberFormatException