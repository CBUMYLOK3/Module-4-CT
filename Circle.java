public class Circle extends Shape {

    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public String toString() {
        return "Circle Area: " + area() + "\nCircle Perimeter: " + perimeter();
    }

}
