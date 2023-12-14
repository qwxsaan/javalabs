package aaaaaaaaa;
import java.util.Random;

public class Student {
    private int ID;
    private int testResults;
    Student() {
        ID = 0;
        testResults = 0;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getTestResults() {
        return testResults;
    }

    public void setTestResults(int testResults) {
        this.testResults = testResults;
    }

    @Override
    public String toString() {
        return getID() + " " + getTestResults() + "\n";
    }
}
