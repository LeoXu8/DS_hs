/**
 * Tests the polymorphism
 * @author Leo Xu
 */
public class ShapesRunner{
  public static void main(String[] args){
    //initializes all the shapes with different properties
    Shapes triangle = new Triangle();
    Shapes square = new Squares();
    Shapes decagon = new Decagon();
    Shapes shape = new Shapes();

    //tests the function and the overriding capability of java
    System.out.println(triangle.sides());
    System.out.println(square.sides());
    System.out.println(decagon.sides());
    System.out.println(shape.sides());

  }
}
