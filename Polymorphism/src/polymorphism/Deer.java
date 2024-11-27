package polymorphism;
public class Deer extends Animal implements vegetation  {
    @Override
    public void walk() {
        System.out.println("The deer walks");
    }
}
