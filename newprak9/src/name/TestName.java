package name;

public class TestName {
    public static void main(String[] args){
        Planet planet = new Planet("Earth", 3);
        System.out.println("The planet "+planet.getName()+" is "+ planet.getCounter());
        Animal animal = new Animal("Bobik", "Dog");
        System.out.println(animal.getName()+" is a "+animal.getType());
    }

}
