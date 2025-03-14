package Bai10;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }
    @Override
    public String toString() {
        return "Bán kính hình tròn: " +this.radius+ " - Diện tích hình tròn: " + calculateArea() + " - Chu vi hình tròn: " + calculatePerimeter();
    }
}
