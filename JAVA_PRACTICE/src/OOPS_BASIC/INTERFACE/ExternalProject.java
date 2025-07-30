package OOPS_BASIC.INTERFACE;

public class ExternalProject {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.algo(10,45));
    }
}
