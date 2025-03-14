package Bai10;

public class Triangle extends Shape {
    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Cạnh a: " +this.a+ " - Cạnh b: " +this.b+ " - Cạnh c: " +this.c+ " - Diện tích tam giác: " +calculateArea()+ " - Chu vi tam giác: " +calculatePerimeter();
    }
}
