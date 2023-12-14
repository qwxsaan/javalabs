package aaaaaaaaa;
import java.util.Arrays;
import java.util.Scanner;
public class TestStudentSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setID(in.nextInt());
            students[i].setTestResults(in.nextInt());
        }
        Sort.insertionSort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
        System.out.println("____________________");
        Sort.quickSort(students, 0, students.length - 1);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
        Student[] students2 = new Student[5];
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student();
            students2[i].setID(in.nextInt());
            students2[i].setTestResults(in.nextInt());
        }
        students = Sort.mergeSort(students);
        students2 = Sort.mergeSort(students2);
        students = Sort.merge(students, students2);
        System.out.println("____________________");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
    }
}
