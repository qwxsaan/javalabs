package name;

public class Planet implements Nameable{
    private String name;
    private int counter;

    public Planet(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public String getName() {
        return name;
    }
    public int getCounter(){
        return counter;
    }
}

