package upr1;
//Дано натуральное число n>1. Проверьте, является ли оно простым.
//Программа должна вывести слово YES, если число простое и NO, если число
//составное
public class Prostota {
    public static boolean recursion(int n, int i){

        if (n<i) return false;
        else if (n==i) return true;
        else if(n%i==0) return false;
        else if(i<n/2)  return recursion(n,i+1);
        else return true;

    }
    public static void main(String[] args) {
        System.out.println(recursion(2000,2));
    }
}
