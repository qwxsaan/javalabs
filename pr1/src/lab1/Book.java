package lab1;
import java.lang.*;
public class Book {
    private String author;
    private int year;
    public Book(String n, int a){
        author = n;
        year = a;
    }
    public Book(String n){
        author = n;
        year = 0;
    }
    public Book(){
        author = "Pushkin";
        year = 1800;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAuthor(String name) {
        this.author = name;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getYear() {
        return year;
    }
    public String toString(){
        return this.author+", at year "+this.year;
    }
}
