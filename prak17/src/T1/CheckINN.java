package T1;
import java.util.Scanner;
public class CheckINN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write fio");
        String fio = in.next();
        System.out.println("Write an INN");
        String inn = in.next();
        if (inn.length() != 12) {
            throw new NullPointerException("Incorrect inn");
        }
        else{
            System.out.println("Inn is okay, accepted!");
        }
        //else {
            //throw new NullPointerException("Inn is incorrect");
        //}
    }
}
