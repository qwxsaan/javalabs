package upr1;
import java.lang.*;
//Дано натуральное число n>1. Выведите все простые множители этого
//числа в порядке не убывания с учетом кратности
public class Mnojiteli {
    public static void recursion(int n, int i){
        if (i>n) return;
        if(n%i==0){
            System.out.println(i);
            n=n/i;

        }
        recursion(n,i+1);
    }
    public static void main(String[] args){
        recursion(169,2);
    }
}
