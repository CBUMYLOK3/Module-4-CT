public class ShapeArray {

    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(6, 7, 8);
        Circle circle = new Circle(9);
        Rectangle rectangle = new Rectangle(10, 11);

        Shape[] ShapeArray = {triangle, circle, rectangle};

        for (Shape shape : ShapeArray) {
            System.out.println(shape.toString());
        }
    }
    
}
