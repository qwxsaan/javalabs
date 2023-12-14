package T1to3;
import java.io.Serializable;
public class Parameters <T extends String & Comparable<String>, V extends Animal & Serializable, K>{
    T t;
    V v;
    K k;
    Parameters(T t,V v,K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return t.getClass() + " " + v.getClass() + " " + k.getClass();
    }
}
