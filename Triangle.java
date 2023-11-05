public class Triangle extends Shape {
        
    private double lengthSide1;
    private double lengthSide2;
    private double lengthSide3;

    public Triangle(double lengthSide1, double lengthSide2, double lengthSide3) {
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    public double area() {
        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - lengthSide1) * (semiPerimeter - lengthSide2) * (semiPerimeter - lengthSide3));
    }

    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }

    public String toString() {
        return "Triangle Area: " + area() + "\nTriangle Perimeter: " + perimeter();
    }
    
}
