package T1;

public class Test {
    public static void main(String[] args) {
        AbstractComplexFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        System.out.println(complex);
    }


}
