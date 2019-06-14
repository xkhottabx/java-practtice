package day59_Polymorphism;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1=new Shape();
        shape1.draw();

        Shape triangle=new Triangle();
        triangle.draw();
        
    }
}
