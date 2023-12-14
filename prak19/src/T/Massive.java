package T;
import java.util.ArrayList;
import java.util.List;
public class Massive {
    private Object[] objects;
    public Massive() {
        objects = new Object[4];
        objects[0] = 3;
        objects[1] = 1.5;
        objects[2] = "string";
        objects[3] = 'c';
    }
    public Massive(int a) {
        objects = new Object[a];
    }

    public Object[] getObjects() {
        return objects;
    }
    public Object getObject(int i) {
        return objects[i];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < objects.length; i++) {
            result += objects[i] + "\n";
        }
        return result;
    }

}
