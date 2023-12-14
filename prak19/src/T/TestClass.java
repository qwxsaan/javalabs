package T;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class TestClass {
    public static <T> List<T> convert(T array[])
    {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        Massive anyMassive = new Massive();
        System.out.println(anyMassive);
        System.out.println(convert(anyMassive.getObjects()));
        System.out.println(anyMassive.getObject(2));

    }
}
