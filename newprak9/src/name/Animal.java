package name;

public class Animal implements Nameable{
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }
}
